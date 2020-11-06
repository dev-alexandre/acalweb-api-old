package br.com.acalapi.controller;

import br.com.acalapi.dto.SelectDTO;
import br.com.acalapi.entity.Grupo;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.GrupoRepository;
import br.com.acalapi.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupo")
public class GrupoController extends Controller<Grupo, Filtro>{

    @Autowired
    private GrupoRepository repository;

    @Autowired
    private GrupoService service;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Grupo> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Grupo t){
        repository.save(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Grupo t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

    @RequestMapping(value="/selecionar", method = RequestMethod.GET)
    public List<SelectDTO<Grupo>> Selecionar() {
        return service.listarSelect();
    }

}
