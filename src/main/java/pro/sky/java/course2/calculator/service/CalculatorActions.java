package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorActions implements Calculation {
    @Override
    public String getSalute() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plusAction(String num1, String num2) {
        return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Override
    public String minusAction(String num1, String num2) {
        return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    @Override
    public String multiplyAction(String num1, String num2) {
        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @Override
    public String divideAction(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if (b == 0) {
            throw new IllegalArgumentException("Передан делитель равный 0");
        }
        return num1 + " / " + num2 + " = " + (a / b);
    }
}
