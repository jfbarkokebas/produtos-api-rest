package com.felipe.produtosapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.produtosapirest.models.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}
