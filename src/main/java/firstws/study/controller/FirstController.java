package firstws.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(path = "/ola")
    public String Ola(){
        return "Teste";
    }
}
