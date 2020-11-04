package br.com.acalapi.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "grupo")
public class Grupo extends AE {

    private String nome;
    private BigDecimal valor;
    private Categoria categoria;
}