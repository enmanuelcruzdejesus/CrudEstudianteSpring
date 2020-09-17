package com.spring.crud.repo;

import com.spring.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CrudRepo  extends JpaRepository<Product, Integer>{


}
