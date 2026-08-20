package com.mariolemos.pedido_produto.pedido_produto.repository;

import com.mariolemos.pedido_produto.pedido_produto.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
