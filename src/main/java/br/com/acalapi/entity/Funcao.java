package br.com.acalapi.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Funcao implements GrantedAuthority {

    @Indexed(unique = true, sparse = true, name = "funcao.nome")
    private String nome;

    @Override
    public String getAuthority() {
        return nome;
    }

}