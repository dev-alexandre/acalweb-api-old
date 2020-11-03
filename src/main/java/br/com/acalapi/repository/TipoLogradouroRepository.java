package br.com.acalapi.repository;

import br.com.acalapi.entity.TipoLogradouro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoLogradouroRepository extends MongoRepository<TipoLogradouro, String> {
}
