package com.spring.crud.service;

import com.spring.crud.model.Product;
import com.spring.crud.repo.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {


    @Autowired
    private CrudRepo repo;

    public List<Product> fetchproductList(){
          return  repo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return repo.findById(id);
    }

    public Product saveProduct(Product product){
       return repo.save(product);
    }

    public void deleteProduct(int id){
        this.repo.deleteById(id);
    }


}
