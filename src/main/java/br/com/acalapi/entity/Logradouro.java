package br.com.acalapi.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "logradouro")
public class Logradouro extends AE {

    private String nome;
    private TipoLogradouro tipoLogradouro;

}