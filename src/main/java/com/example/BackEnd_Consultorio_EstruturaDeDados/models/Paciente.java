package com.example.BackEnd_Consultorio_EstruturaDeDados.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue()
    private UUID id;

    private String nome;
    private String email;
    private String cpf;
    private Integer cep;
    private LocalDate dataNascimento;
    private Boolean isPCD;



}
