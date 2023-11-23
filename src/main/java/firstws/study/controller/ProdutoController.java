package firstws.study.controller;

import firstws.study.model.entities.Produto;
import firstws.study.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto produto = new Produto(nome);

        produtoRepository.save(produto);
        return produto;
    }
}
