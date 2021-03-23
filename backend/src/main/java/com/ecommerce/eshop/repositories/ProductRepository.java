package com.ecommerce.eshop.repositories;

import com.ecommerce.eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") //let us to get to other local front host
public interface ProductRepository extends JpaRepository<Product, Long> {

}
