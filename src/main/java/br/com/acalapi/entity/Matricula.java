package br.com.acalapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "matricula")
public class Matricula extends AE {

    private String numero;
    private String letra;
    private String hidrometro;
    private Logradouro Logradouro;

}