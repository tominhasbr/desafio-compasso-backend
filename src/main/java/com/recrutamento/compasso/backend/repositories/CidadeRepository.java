package com.recrutamento.compasso.backend.repositories;

import com.recrutamento.compasso.backend.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    @Query(value="SELECT * FROM cidade cid WHERE LOWER(cid.nome) LIKE LOWER(?1)", nativeQuery=true)
    List<Cidade> findByName(String name);

    @Query(value="SELECT * FROM cidade cid WHERE LOWER(cid.estado) LIKE LOWER(?1)", nativeQuery=true)
    List<Cidade> findByState(String state);
}