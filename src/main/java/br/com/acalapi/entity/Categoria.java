package br.com.acalapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Categoria {

    private String nome;

    public Categoria(String nome){
        this.nome = nome;
    }

}