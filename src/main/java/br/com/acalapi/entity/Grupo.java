package br.com.acalapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Data
@Document(collection = "grupo")
public class Grupo extends AE {

    private String nome;
    private BigDecimal valor;
    private Categoria categoria;
}