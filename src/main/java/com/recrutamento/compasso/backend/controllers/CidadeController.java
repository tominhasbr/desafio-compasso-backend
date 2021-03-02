package com.recrutamento.compasso.backend.controllers;

import com.recrutamento.compasso.backend.models.Cidade;
import com.recrutamento.compasso.backend.services.CidadeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/Cidade")
public class CidadeController {

    private final CidadeService service;

    public CidadeController(CidadeService service) {
        this.service = service;
    }

    @PostMapping
    public Cidade create(@RequestBody Cidade entity) {
        return service.save(entity);
    }

    @GetMapping("/byName")
    public List<Cidade> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @GetMapping("/byState")
    public List<Cidade> findByState(@RequestParam String state) {
        return service.findByState(state);
    }

}
