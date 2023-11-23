package firstws.study.model.repositories;

import firstws.study.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String contemNome);
}
