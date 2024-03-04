package com.felipe.produtosapirest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.produtosapirest.Services.ProdutoService;
import com.felipe.produtosapirest.models.Produto;


@RestController
@RequestMapping("/api")
public class ProdutoController {
    
    ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping("/produtos")
    public ResponseEntity<List <Produto>> listarTodosProdutos(){
       List<Produto> produtos = service.findAll();

       return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
    }
}
