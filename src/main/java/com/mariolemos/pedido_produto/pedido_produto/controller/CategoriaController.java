package com.mariolemos.pedido_produto.pedido_produto.controller;

import com.mariolemos.pedido_produto.pedido_produto.model.Categoria;
import com.mariolemos.pedido_produto.pedido_produto.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarTodos(Categoria categoria) {
        List<Categoria> categorias = categoriaService.buscarTodos();
        return ResponseEntity.ok().body(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable("id") Long id){
        Categoria categoria = categoriaService.buscarPorId(id);
        return ResponseEntity.ok().body(categoria);
    }

    @PostMapping
    public ResponseEntity<Categoria> incluir(@RequestBody Categoria categoria) {
        Categoria categoria1 = categoriaService.incluir(categoria);
        return ResponseEntity.ok(categoria1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> atualizar(@PathVariable("id") Long id, @RequestBody Categoria categoria){
        Categoria categoria1 = categoriaService.atualizar(categoria, id);
        return ResponseEntity.ok().body(categoria1);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        categoriaService.excluir(id);
    }
}
