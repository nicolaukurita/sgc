package br.com.etematica.sgc.controller;

import br.com.etematica.sgc.model.Projeto;
import br.com.etematica.sgc.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/projeto/")
public class ProjetoController {

    @Autowired
    private ProjetoService service;

    @RequestMapping(value = "projetos", method = RequestMethod.GET)
    public List<Projeto> list() {
        return service.list();
    }

    @RequestMapping(value = "generate", method = RequestMethod.GET)
    public String generate() {

        return service.generate();
    }
}
