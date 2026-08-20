package com.mariolemos.pedido_produto.pedido_produto.controller;

import com.mariolemos.pedido_produto.pedido_produto.model.Categoria;
import com.mariolemos.pedido_produto.pedido_produto.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> buscarTodos(Categoria categoria) {
        List<Categoria> categorias = categoriaService.buscarTodos();
        return ResponseEntity.ok().body(categorias);
    }
}
