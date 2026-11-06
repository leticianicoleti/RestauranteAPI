package com.restauranteAPI.restauranteAPI.repository;

import com.restauranteAPI.restauranteAPI.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface PratoRepository extends JpaRepository<Prato, Long> {
    List<Prato> findByDisponivelTrue();
}
