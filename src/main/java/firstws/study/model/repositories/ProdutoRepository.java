package firstws.study.model.repositories;

import firstws.study.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer> {

}
