package com.restauranteAPI.restauranteAPI.repository;

import com.restauranteAPI.restauranteAPI.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
