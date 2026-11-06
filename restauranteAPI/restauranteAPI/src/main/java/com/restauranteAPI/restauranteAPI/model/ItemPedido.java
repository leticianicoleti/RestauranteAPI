package com.restauranteAPI.restauranteAPI.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "itens_pedido")
public class ItemPedido {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    private Pedido pedido;
    @ManyToOne(optional = false)
    private Prato prato;
    @Min(1)
    private int quantidade;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal precoUnitario;
}

