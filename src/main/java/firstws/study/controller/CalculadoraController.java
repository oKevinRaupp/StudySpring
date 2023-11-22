package firstws.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/calculadora")
public class CalculadoraController {
    @GetMapping(path = "/somar/{x}/{y}")
    public int metodoSomar(@PathVariable int x, @PathVariable int y){
        return x + y;
    }
    @GetMapping(path = "/subtrair")
    public int metodoSubtrair(@RequestParam(name = "x") int x,@RequestParam(name = "y") int y){
        return x - y;
    }

}
