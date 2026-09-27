package labspringmvc.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import labspringmvc.models.Produto;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}