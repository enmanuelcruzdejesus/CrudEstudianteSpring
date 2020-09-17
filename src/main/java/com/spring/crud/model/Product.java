package com.spring.crud.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private String desc;
    private int price;

    public Product(){ super();}
    public Product(int id, String name, String desc, int price){
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int value){
        this.id = value;
    }

    public void setName(String value){
        this.name = value;
    }

    public void setDesc(String value){
        this.desc = value;
    }

    public void setPrice(int value){
        this.price = value;
    }
}
