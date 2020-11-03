package br.com.acalapi.controller;

import br.com.acalapi.entity.Matricula;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController extends Controller<Matricula, Filtro>{

    @Autowired
    private MatriculaRepository repository;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Matricula> listar(){
        return repository.findAll();
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

}
