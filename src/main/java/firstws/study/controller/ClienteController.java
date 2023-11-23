package firstws.study.controller;

import firstws.study.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/clientes")
public class ClienteController {
    @RequestMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(1,"Kevin Teste","012345678910");
    }
    @GetMapping("/{id}")
    public Cliente obterClientePorID(@PathVariable int id){
        return new Cliente(id,"TesteID","929-234-234-11");
    }
    @GetMapping
    public Cliente obterClientePorID2(@RequestParam(name = "id",defaultValue = "1") int id){
        return new Cliente(id,"TesteID2","929-234-234-11");
    }
}
