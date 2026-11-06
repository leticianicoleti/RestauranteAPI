package com.restauranteAPI.restauranteAPI.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.*;

@Data
@Entity
@Table(name = "categorias")
public class Categoria {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 2, max = 60)
    private String nome;
    @Size(max = 255)
    private String descricao;
    @JsonIgnore
    @OneToMany(mappedBy = "categoria")
    private List<Prato> pratos = new ArrayList<>();
}


