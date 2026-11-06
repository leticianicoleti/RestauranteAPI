package com.restauranteAPI.restauranteAPI.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pratos")
public class Prato {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2, max = 100)
    private String nome;
    @Size(max = 255)
    private String descricao;
    @NotNull
    @DecimalMin("0.01")
    private BigDecimal preco;
    private boolean disponivel = true;
    @ManyToOne(optional = false)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}

