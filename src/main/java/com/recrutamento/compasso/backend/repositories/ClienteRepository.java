package com.recrutamento.compasso.backend.repositories;

import com.recrutamento.compasso.backend.models.Cidade;
import com.recrutamento.compasso.backend.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findById(long id);

    @Query(value="SELECT * FROM cliente cli WHERE LOWER(cli.nome) LIKE LOWER(?1)", nativeQuery=true)
    List<Cliente> findByName(String name);
}
