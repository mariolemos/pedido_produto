package com.mariolemos.pedido_produto.pedido_produto.controller;

import com.mariolemos.pedido_produto.pedido_produto.model.Produto;
import com.mariolemos.pedido_produto.pedido_produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> incluir(@RequestBody Produto produto) {
        Produto produtoNovo = produtoService.incluir(produto);
        return ResponseEntity.ok(produtoNovo);
    }
}
