package com.example.microserv.interfaz;

import com.example.microserv.entity.EntidadClase;
import org.springframework.data.repository.CrudRepository;

public interface InterfazClase extends CrudRepository<EntidadClase, Integer> {
}
