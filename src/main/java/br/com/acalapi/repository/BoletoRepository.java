package br.com.acalapi.repository;

import br.com.acalapi.entity.Boleto;
import br.com.acalapi.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BoletoRepository extends MongoRepository<Boleto, String> {

}
