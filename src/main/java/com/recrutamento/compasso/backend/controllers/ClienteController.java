package com.recrutamento.compasso.backend.controllers;
import com.recrutamento.compasso.backend.models.Cliente;
import com.recrutamento.compasso.backend.repositories.ClienteRepository;
import com.recrutamento.compasso.backend.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/Cliente")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente entity) {
        return service.save(entity);
    }

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Cliente find(@PathVariable(value="id") long id) {
        return service.find(id);
    }

    @GetMapping("/byName")
    public List<Cliente> findByName(@RequestParam String name) {
        return service.findByName(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value="id") long id) {
        service.remove(id);
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente entity) {
        return service.save(entity);
    }

}
