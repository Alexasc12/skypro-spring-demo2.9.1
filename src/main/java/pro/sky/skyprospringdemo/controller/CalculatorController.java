package pro.sky.skyprospringdemo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.service.CalculatorService;

@RestController
@RequiredArgsConstructor

public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/calculator/plus")

    public String plus(@RequestParam(name = "num1")Integer a,
                           @RequestParam(name = "num2") Integer b){
       int plus = calculatorService.plus(a, b);
        return a + "+" + b + "=" + plus;

    }
    @GetMapping("/calculator/minus")
    public String minus(@RequestParam(name = "num1")Integer a,
                       @RequestParam(name = "num2") Integer b){
      int minus =  calculatorService.minus(a, b);
        return a + "-" + b + "=" + minus;

    }
    @GetMapping("/calculator/multiple")
    public String multiple(@RequestParam(name = "num1")Integer a,
                       @RequestParam(name = "num2") Integer b){
       int multiple = calculatorService.multiple(a, b);
        return a + "*" + b + "=" + multiple;

    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam(name = "num1")Integer a,
                       @RequestParam(name = "num2") Integer b){
       double divide = calculatorService.divide(a, b);
        return a + " / " + b + "=" + divide;

    }

}
