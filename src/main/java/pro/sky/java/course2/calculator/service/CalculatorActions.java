package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorActions implements Calculation {

    @Override
    public int plusAction(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    @Override
    public int minusAction(String num1, String num2) {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    @Override
    public int multiplyAction(String num1, String num2) {
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    @Override
    public int divideAction(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if (b == 0) {
            throw new IllegalArgumentException("Передан делитель равный 0");
        }
        return a / b;
    }
}
