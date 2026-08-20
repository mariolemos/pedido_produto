package com.mariolemos.pedido_produto.pedido_produto.service;

import com.mariolemos.pedido_produto.pedido_produto.model.Categoria;
import com.mariolemos.pedido_produto.pedido_produto.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }
}

