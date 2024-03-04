package com.felipe.produtosapirest;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.produtosapirest.models.Produto;
import com.felipe.produtosapirest.repositories.ProdutoRepository;

@SpringBootApplication
public class ProdutosApiRestApplication {

	@Bean
	public CommandLineRunner onInit(ProdutoRepository rep){
		return args->{

			Produto p1 = new Produto();
			p1.setNome("caderno");
			BigDecimal qtde = new BigDecimal(2);
			p1.setQuantidade(qtde);
			BigDecimal value = new BigDecimal(15.00);
			p1.setValor(value);
			rep.save(p1);

			Produto p2 = new Produto();
			p1.setNome("notebook");
			BigDecimal qtde2 = new BigDecimal(1);
			p1.setQuantidade(qtde2);
			BigDecimal value2 = new BigDecimal(2999.90);
			p1.setValor(value2);
			rep.save(p2);

			Produto p3 = new Produto();
			p1.setNome("borracha");
			BigDecimal qtde3 = new BigDecimal(10);
			p1.setQuantidade(qtde3);
			BigDecimal value3 = new BigDecimal(0.90);
			p1.setValor(value3);
			rep.save(p3);
			
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiRestApplication.class, args);
		System.out.println(" *** Buid Success ***");
	}

}
