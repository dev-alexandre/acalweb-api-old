package br.com.acalapi.service;

import br.com.acalapi.entity.Usuario;
import br.com.acalapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        return
            mongoTemplate.findOne(
                new Query().addCriteria(Criteria.where("email").regex("^" + nome + "$")),
                Usuario.class);
    }

}
