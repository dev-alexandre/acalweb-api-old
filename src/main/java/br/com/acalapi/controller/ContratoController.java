package br.com.acalapi.controller;

import br.com.acalapi.entity.Boleto;
import br.com.acalapi.entity.Contrato;
import br.com.acalapi.entity.Referencia;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.ContratoRepository;
import br.com.acalapi.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoController extends Controller<Contrato, Filtro>{

    @Autowired
    private ContratoRepository repository;

    @Autowired
    private ContratoService service;

    @RequestMapping(value="/listar/{mes}/{ano}", method = RequestMethod.GET)
    public List<Contrato> listar(@PathVariable int mes, @PathVariable int ano){
        return service.listarContratosDisponiveisPor(new Referencia(mes, ano));
    }

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Contrato> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Contrato t){
        repository.save(t);
    }

    @RequestMapping(value="/salvar-todos", method = RequestMethod.POST)
    public void salvartodos(@RequestBody List<Contrato> t){
        repository.saveAll(t);
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
