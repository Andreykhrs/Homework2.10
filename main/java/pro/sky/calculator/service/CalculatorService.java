package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.NotFoundException;
import pro.sky.calculator.exception.NotValidationArgumentException;

@Service
public class CalculatorService {

    private void validation(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotFoundException();
        }
    }

    public Integer plus(Integer num1, Integer num2) {
        validation(num1, num2);
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        validation(num1, num2);
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        validation(num1, num2);
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        validation(num1, num2);
        if (num2 == 0) {
            throw new NotValidationArgumentException();
        }
        return num1 / num2;
    }

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

}
