package com.recrutamento.compasso.backend.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Getter
@Setter
@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String sexo;
    private Integer idade;
    private String cidade;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataNascimento;
}
