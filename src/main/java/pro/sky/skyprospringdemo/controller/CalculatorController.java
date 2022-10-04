package pro.sky.skyprospringdemo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.skyprospringdemo.service.CalculatorService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator/")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/plus")


    public String plus(@RequestParam(name = "num1", required = false)Integer a,
                           @RequestParam(name = "num2", required = false) Integer b){
        if ( a == null || b == null) return "Параметр не передан";
       int plus = calculatorService.plus(a, b);
        return a + "+" + b + "=" + plus;

    }
    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false)Integer a,
                       @RequestParam(name = "num2", required = false) Integer b){
        if ( a == null || b == null) return "Параметр не передан";
      int minus =  calculatorService.minus(a, b);
        return a + "-" + b + "=" + minus;

    }
    @GetMapping("/multiple")
    public String multiple(@RequestParam(name = "num1", required = false)Integer a,
                       @RequestParam(name = "num2", required = false) Integer b){
        if ( a == null || b == null) return "Параметр не передан";
       int multiple = calculatorService.multiple(a, b);
        return a + "*" + b + "=" + multiple;

    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false)Integer a,
                       @RequestParam(name = "num2",required = false) Integer b){
        if ( a == null || b == null) return "Параметр не передан";
        double divide;
        try {
            divide = calculatorService.divide(a, b);
        } catch (Throwable e) {
            return e.getMessage();
        }

        return a + " / " + b + "=" + divide;

    }

}
