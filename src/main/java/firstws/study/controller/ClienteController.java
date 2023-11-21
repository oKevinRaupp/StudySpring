package firstws.study.controller;

import firstws.study.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
