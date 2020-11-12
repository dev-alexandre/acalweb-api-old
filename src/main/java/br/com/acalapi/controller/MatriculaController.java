package br.com.acalapi.controller;

import br.com.acalapi.dto.SelectDTO;
import br.com.acalapi.entity.Grupo;
import br.com.acalapi.entity.Matricula;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.MatriculaRepository;
import br.com.acalapi.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController extends Controller<Matricula, Filtro>{

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private MatriculaService service;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Matricula> listar(){
        return
            repository.findAll();

    }

    @Override
    public Sort getSort() {
        return
            Sort.by("logradouro.tipoLogradouro.nome").and(Sort.by("logradouro.nome").and(Sort.by("numero").and(Sort.by("letra"))));
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Matricula t){
        repository.save(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Matricula t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

    @RequestMapping(value="/selecionar/{nome}", method = RequestMethod.GET)
    public List<SelectDTO<Matricula>> Selecionar(@PathVariable String nome) {
        return service.listarSelect(nome);
    }

}
