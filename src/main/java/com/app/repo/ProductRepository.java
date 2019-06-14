package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByProdCode(String prodCode);
	List<Product> findByProdCodeIn(List<String> prodCode);
	List<Product> findByProdCodeIsNotNull();
	

}
