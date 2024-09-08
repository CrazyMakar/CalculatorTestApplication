package pro.sky.calculator_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                       @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра должны быть указаны";
        }
        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра должны быть указаны";
        }
        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра должны быть указаны";
        }
        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: оба параметра должны быть указаны";
        }
        if (num2 == 0) {
            return "Ошибка: деление на ноль невозможно";
        }
        int result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}