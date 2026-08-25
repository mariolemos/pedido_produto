package com.mariolemos.pedido_produto.pedido_produto.repository;

import com.mariolemos.pedido_produto.pedido_produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRespository extends JpaRepository<Produto, Long> {
}
