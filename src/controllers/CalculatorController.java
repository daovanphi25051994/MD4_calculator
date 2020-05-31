package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping()
    public ModelAndView showCalculator(){
        ModelAndView modelAndView = new ModelAndView("calculator");
        return modelAndView;
    }
    @PostMapping()
    public ModelAndView calculator(@RequestParam String action,  double firstNumber, double secondNumber){
        ModelAndView modelAndView = new ModelAndView("calculator");
        switch (action){
            case "add" : modelAndView.addObject("result", firstNumber + secondNumber);
                break;
            case "sub" :modelAndView.addObject("result", firstNumber - secondNumber);
                break;
            case "mul" : modelAndView.addObject("result", firstNumber * secondNumber);
                break;
            case "div" :modelAndView.addObject("result", firstNumber / secondNumber);
                break;
        }
        return modelAndView;
    }
}
