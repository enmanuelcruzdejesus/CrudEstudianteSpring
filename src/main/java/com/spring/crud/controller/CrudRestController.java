package com.spring.crud.controller;


import com.spring.crud.model.Product;
import com.spring.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CrudRestController {

    @Autowired
    private CrudService service;



    @RequestMapping(path="/getproductList",method = RequestMethod.GET)
    public List<Product> fetchProductList(){

        List<Product> products = new ArrayList<Product>();

        products = service.fetchproductList();
        return products;

    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id).get();
    }

    @PostMapping("/saveProduct")
    public  Product addProduct(@RequestBody Product product){
       return  service.saveProduct(product);
    }

    @DeleteMapping("deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){

        String result;
        try{
            this.service.deleteProduct(id);
            result = "Product deleted succesufuly";
        }catch (Exception e){
            result = "product is not deleted";

        }

        return result;

    }




}
