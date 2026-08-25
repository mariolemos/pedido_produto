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

    public Categoria buscarPorId(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        return categoria;
    }

    public Categoria incluir(Categoria categoria) {
        categoria = categoriaRepository.save(categoria);
        return categoria;
    }

    public Categoria atualizar(Categoria categoria, Long id){
        Categoria categoria1 = buscarPorId(id);
        categoria1.setNome(categoria.getNome());
        return categoriaRepository.save(categoria1);
    }

    public void excluir(Long id) {
      categoriaRepository.deleteById(id);
    }
}

