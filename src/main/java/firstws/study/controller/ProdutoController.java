package firstws.study.controller;

import firstws.study.model.entities.Produto;
import firstws.study.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path ="/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }
    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return produtoRepository.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }
    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPagina(@PathVariable int numeroPagina,@PathVariable int qtdePagina){
        if(qtdePagina >= 5) qtdePagina = 5;
        Pageable page = PageRequest.of(numeroPagina,qtdePagina);
        return produtoRepository.findAll(page);
    }
    @DeleteMapping(path = "{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }

}
