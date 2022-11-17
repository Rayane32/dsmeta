package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

//faz operações com as vendas (salva, deleta muda etc) interface do bolado.

@Service //service como componente do sistema
public class SalesService {
	
	//aqui é para acessar a tabela de vendas no sistema, 
		//mas quem acessa o banco de dados é o Repository, então dentro do Service, chama o repository.
	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales() {
		return repository.findAll();
		
	}
}
