package com.restauranteAPI.restauranteAPI.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pedidos")
public class Pedido {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data = LocalDateTime.now();
    @Enumerated(EnumType.STRING)
    private StatusPedido status = StatusPedido.ABERTO;
    @NotNull
    @DecimalMin("0.00")
    private BigDecimal valorTotal = BigDecimal.ZERO;
    @ManyToOne(optional = false)
    @JoinColumn(name = "prato_id")
    private Prato prato;
    @Min(1)
    private int quantidade = 1;

    public enum StatusPedido {ABERTO, PREPARANDO, CONCLUIDO, CANCELADO}
}

