package br.com.acalapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
public class TipoLogradouro {

    private String nome;

    public TipoLogradouro(String nome){
        this.nome = nome;
    }

}