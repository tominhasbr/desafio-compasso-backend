package com.recrutamento.compasso.backend.services;

import com.recrutamento.compasso.backend.models.Cidade;
import com.recrutamento.compasso.backend.repositories.CidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    private final CidadeRepository repository;

    public CidadeService(CidadeRepository repository) {
        this.repository = repository;
    }

    public Cidade save(Cidade entity) {
        return repository.save(entity);
    }

    public List<Cidade> findByName(String name) {
        return repository.findByName(name);
    }

    public List<Cidade> findByState(String state) {
        return repository.findByState(state);
    }

}
