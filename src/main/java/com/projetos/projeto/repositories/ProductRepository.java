package com.projetos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}