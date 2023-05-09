package pro.sky.skyprohomeworkcalculatortest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprohomeworkcalculatortest.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        String calculatorResult = num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
        return calculatorResult;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        String calculatorResult = num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
        return calculatorResult;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        String calculatorResult = num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
        return calculatorResult;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        String calculatorResult = num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        return calculatorResult;
    }

}
