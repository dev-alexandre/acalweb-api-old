package br.com.acalapi.controller;

import br.com.acalapi.entity.Boleto;
import br.com.acalapi.entity.Contrato;
import br.com.acalapi.entity.Referencia;
import br.com.acalapi.filtro.Filtro;
import br.com.acalapi.repository.BoletoRepository;
import br.com.acalapi.repository.ContratoRepository;
import br.com.acalapi.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleto")
public class BoletoController extends Controller<Boleto, Filtro>{

    @Autowired
    private BoletoRepository repository;

    @RequestMapping(value="/listar", method = RequestMethod.GET)
    public List<Boleto> listar(){
        return repository.findAll();
    }

    @RequestMapping(value="/salvar", method = RequestMethod.POST)
    public void salvar(@RequestBody Boleto t){
        repository.save(t);
    }

    @RequestMapping(value="/salvar-todos", method = RequestMethod.POST)
    public void salvartodos(@RequestBody List<Boleto> t){
        repository.saveAll(t);
    }

    @RequestMapping(value="/editar", method = RequestMethod.PUT)
    public void editar(@RequestBody Boleto t){
        repository.save(t);
    }

    @RequestMapping(value="/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable String id) {
        repository.deleteById(id);
    }

}
