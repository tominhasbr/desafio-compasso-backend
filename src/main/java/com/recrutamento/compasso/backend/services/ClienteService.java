package com.recrutamento.compasso.backend.services;

import com.recrutamento.compasso.backend.models.Cliente;
import com.recrutamento.compasso.backend.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente save(Cliente entity) {
        return repository.save(entity);
    }

    public Cliente find(long id) {
        return repository.findById(id);
    }

    public List<Cliente> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public void remove(long id) {
        Cliente cliente = this.find(id);
        repository.delete(cliente);
    }
}
