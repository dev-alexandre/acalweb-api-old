package br.com.acalapi.controller;

import br.com.acalapi.entity.Cliente;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends Controller<Cliente, Filtro>{

    @Autowired
    private ClienteRepository repository;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Cliente> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Cliente t){
        repository.save(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Cliente t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

}
