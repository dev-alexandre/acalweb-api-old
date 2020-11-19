package br.com.acalapi.controller;

import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends Controller<Usuario, Filtro>{

    @Autowired
    private UsuarioRepository repository;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Usuario> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Usuario t){
        repository.save(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Usuario t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

}
