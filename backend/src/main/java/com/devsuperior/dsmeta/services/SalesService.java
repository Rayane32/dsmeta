package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		//configuração para pegar a data local do sistema.
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		//comparação se maxDate for igual a vazio será o today, se não será igual ao maxDate
		
		return repository.findSales(min, max, pageable);
		
	}
}
