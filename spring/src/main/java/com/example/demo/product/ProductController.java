package com.example.demo.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/products")
public class ProductController{
    @GetMapping
    public ArrayList<Product> getProducts(){
        ArrayList<Product> product = new ArrayList<>();
        Product lotion = new Product();
        lotion.setId(1L);
        lotion.setTitle("Lotion");
        product.add(lotion);
        Product faceWash = new Product();
        faceWash.setId(2L);
        faceWash.setTitle("Face Wash");
        product.add(faceWash);
        return product;
    }
}