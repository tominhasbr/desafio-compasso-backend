package com.recrutamento.compasso.backend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String estado;
}
