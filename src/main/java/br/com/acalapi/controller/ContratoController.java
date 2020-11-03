package br.com.acalapi.controller;

import br.com.acalapi.entity.Contrato;
import br.com.acalapi.entity.Matricula;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.ContratoRepository;
import br.com.acalapi.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoController extends Controller<Contrato, Filtro>{

    @Autowired
    private ContratoRepository repository;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Contrato> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Contrato t){
        repository.save(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Contrato t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

}
