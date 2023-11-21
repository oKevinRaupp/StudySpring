package firstws.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(path = "/ola")
    public String Ola(){
        return "Teste";
    }

    @RequestMapping(path = "/ola2")
    public double saudacao(){
        return multiplicar(4.5,2.0);
    }

    public double multiplicar(double x, double y){
        return x * y;
    }
}
