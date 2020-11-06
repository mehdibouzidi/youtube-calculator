package com.springws.calculator.controller;

import com.springws.calculator.model.in.InputData;
import com.springws.calculator.model.out.OutputData;
import com.springws.calculator.service.contract.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
@CrossOrigin
public class CalculatorController {

    @Autowired
    private ICalculatorService calculatorService;

    @PostMapping(path = "add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OutputData> additionEndpoint(@RequestBody InputData inputData){
        OutputData outputData = calculatorService.add(inputData);
        return new ResponseEntity(outputData, HttpStatus.OK);
    }
}
