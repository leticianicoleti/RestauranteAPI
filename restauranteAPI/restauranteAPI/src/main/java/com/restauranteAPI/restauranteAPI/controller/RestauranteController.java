package com.restauranteAPI.restauranteAPI.controller;

import com.restauranteAPI.restauranteAPI.model.*;
import com.restauranteAPI.restauranteAPI.service.RestauranteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class RestauranteController {

    private final RestauranteService s;

    public RestauranteController(RestauranteService s) {
        this.s = s;
    }

    @GetMapping("/categorias")
    public List<Categoria> categorias() {
        return s.categorias();
    }

    @GetMapping("/categorias/{id}")
    public Categoria categoria(@PathVariable Long id) {
        return s.categoria(id);
    }

    @PostMapping("/categorias")
    public Categoria criarCategoria(@Valid @RequestBody Categoria x) {
        x.setId(null);
        return s.salvar(x);
    }

    @PutMapping("/categorias/{id}")
    public Categoria atualizarCategoria(@PathVariable Long id, @Valid @RequestBody Categoria x) {
        x.setId(id);
        return s.salvar(x);
    }

    @DeleteMapping("/categorias/{id}")
    public void apagarCategoria(@PathVariable Long id) {
        s.apagarCategoria(id);
    }

    @GetMapping("/pratos")
    public List<Prato> pratos() {
        return s.pratos();
    }

    @GetMapping("/pratos/disponiveis")
    public List<Prato> disponiveis() {
        return s.disponiveis();
    }

    @GetMapping("/pratos/{id}")
    public Prato prato(@PathVariable Long id) {
        return s.prato(id);
    }

    @PostMapping("/pratos")
    public Prato criarPrato(@Valid @RequestBody Prato x) {
        return s.salvar(x);
    }

    @PutMapping("/pratos/{id}")
    public Prato atualizarPrato(@PathVariable Long id, @Valid @RequestBody Prato x) {
        x.setId(id);
        return s.salvar(x);
    }

    @DeleteMapping("/pratos/{id}")
    public void apagarPrato(@PathVariable Long id) {
        s.apagarPrato(id);
    }

    @GetMapping("/pedidos")
    public List<Pedido> pedidos() {
        return s.pedidos();
    }

    @GetMapping("/pedidos/{id}")
    public Pedido pedido(@PathVariable Long id) {
        return s.pedido(id);
    }

    @PostMapping("/pedidos")
    public Pedido criarPedido(@Valid @RequestBody Pedido x) {
        return s.salvar(x);
    }

    @PutMapping("/pedidos/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @Valid @RequestBody Pedido x) {
        x.setId(id);
        return s.salvar(x);
    }

    @DeleteMapping("/pedidos/{id}")
    public void apagarPedido(@PathVariable Long id) {
        s.apagarPedido(id);
    }

    @GetMapping("/itens-pedido")
    public List<ItemPedido> itens() {
        return s.itens();
    }

    @PostMapping("/itens-pedido")
    public ItemPedido criarItem(@Valid @RequestBody ItemPedido x) {
        return s.salvar(x);
    }

    @DeleteMapping("/itens-pedido/{id}")
    public void apagarItem(@PathVariable Long id) {
        s.apagarItem(id);
    }
}

