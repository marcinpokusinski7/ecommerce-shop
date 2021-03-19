package com.ecommerce.eshop.repositories;

import com.ecommerce.eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
