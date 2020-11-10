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
@RequestMapping("/api")
public class HomeController{

    @RequestMapping(value="/v1", method = RequestMethod.GET)
    public String hello(){
        return "be welcome";
    }

    @RequestMapping(value="/v1/**", method = RequestMethod.GET)
    public String hello1(){
        return "be welcome2";
    }

}
