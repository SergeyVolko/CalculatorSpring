package pro.sky.java.course2.calculator.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.Calculation;

@RestController
@RequestMapping("/calculator")
public class CalculationController {
    private final Calculation calculation;

    public CalculationController(Calculation calculation) {
        this.calculation = calculation;
    }

    @GetMapping
    public String salute() {
        return calculation.getSalute();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculation.plusAction(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculation.minusAction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculation.multiplyAction(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculation.divideAction(num1, num2);
    }
}
