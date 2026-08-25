package com.mariolemos.pedido_produto.pedido_produto.service;

import com.mariolemos.pedido_produto.pedido_produto.model.Produto;
import com.mariolemos.pedido_produto.pedido_produto.repository.ProdutoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRespository produtoRespository;

    public Produto incluir(Produto produto) {
        return produtoRespository.save(produto);
    }
}
