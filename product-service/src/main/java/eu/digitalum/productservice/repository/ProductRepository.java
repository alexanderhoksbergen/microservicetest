package eu.digitalum.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.digitalum.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
	
	

}
