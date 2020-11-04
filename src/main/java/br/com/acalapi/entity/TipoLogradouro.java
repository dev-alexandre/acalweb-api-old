package br.com.acalapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoLogradouro {

    private String nome;

    public TipoLogradouro(String nome){
        this.nome = nome;
    }

}