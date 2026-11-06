package com.restauranteAPI.restauranteAPI.repository;

import com.restauranteAPI.restauranteAPI.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
