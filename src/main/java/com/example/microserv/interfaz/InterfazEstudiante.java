package com.example.microserv.interfaz;

import com.example.microserv.entity.EntidadEstudiante;
import org.springframework.data.repository.CrudRepository;

public interface InterfazEstudiante extends  CrudRepository<EntidadEstudiante, Integer> {
}




