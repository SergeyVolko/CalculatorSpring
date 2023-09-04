package pro.sky.java.course2.calculator.service;

public interface Calculation {
    String getSalute();
    String plusAction(String num1, String num2);
    String minusAction(String num1, String num2);
    String multiplyAction(String num1, String num2);
    String divideAction(String num1, String num2);
}
