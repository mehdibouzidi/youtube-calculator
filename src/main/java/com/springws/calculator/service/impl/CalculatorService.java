package com.springws.calculator.service.impl;

import com.springws.calculator.model.in.InputData;
import com.springws.calculator.model.out.OutputData;
import com.springws.calculator.service.contract.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public OutputData add(InputData inputData) {
        OutputData outputData = new OutputData();
        outputData.setResult((inputData.getFirstParam() + inputData.getSecondParam()));
        return outputData;
    }
}
