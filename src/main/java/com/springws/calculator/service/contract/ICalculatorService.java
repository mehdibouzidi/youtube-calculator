package com.springws.calculator.service.contract;

import com.springws.calculator.model.in.InputData;
import com.springws.calculator.model.out.OutputData;

public interface ICalculatorService {
    OutputData add(InputData inputData);
}
