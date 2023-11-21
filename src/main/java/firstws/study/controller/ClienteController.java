package firstws.study.controller;

import firstws.study.models.Cliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/clientes")
public class ClienteController {
    @RequestMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(1,"Kevin Teste","012345678910");
    }
}
