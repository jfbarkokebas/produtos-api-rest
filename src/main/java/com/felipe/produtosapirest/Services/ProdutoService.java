package com.felipe.produtosapirest.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipe.produtosapirest.models.Produto;
import com.felipe.produtosapirest.repositories.ProdutoRepository;

@Service
public class ProdutoService {
    
    ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> findAll(){
        return repository.findAll();
    }

}
