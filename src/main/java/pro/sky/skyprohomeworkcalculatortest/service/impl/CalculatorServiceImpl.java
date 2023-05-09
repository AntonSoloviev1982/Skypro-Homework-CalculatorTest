package pro.sky.skyprohomeworkcalculatortest.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprohomeworkcalculatortest.service.CalculatorService;


@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        int result = num1 / num2;
        return result;
    }
}
