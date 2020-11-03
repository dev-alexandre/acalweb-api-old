package br.com.acalapi.repository;

import br.com.acalapi.entity.Matricula;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatriculaRepository extends MongoRepository<Matricula, String> {
}
