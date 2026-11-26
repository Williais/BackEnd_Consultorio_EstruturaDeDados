package com.example.BackEnd_Consultorio_EstruturaDeDados.dao;


import com.example.BackEnd_Consultorio_EstruturaDeDados.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PacienteDao extends JpaRepository<Paciente, UUID> {
    List<Paciente> findByCPF(String cpf);
}
