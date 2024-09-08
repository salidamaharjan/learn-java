package com.example.demo.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

@RestController
@RequestMapping("/api/products")
public class ProductController{
    @GetMapping
    public ArrayList<Product> getProducts() throws Exception {
        ArrayList<Product> products = new ArrayList<>();
        //Step 0: optional
        Class.forName("org.postgresql.Driver");
        //Step 1: Establish a connection
        //Required: DB_SERVER_URL, DB_USERNAME, DB_PASSWORD
        //"<PROTCOL>://<URL>:<PORT>/<DB_NAME>"
        String dbUrl = "jdbc:postgresql://localhost:5432/smhr_spring_db";
        String db_username = "root";
        String db_password = "password";

        Connection conn = DriverManager.getConnection(dbUrl, db_username, db_password);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM products");

        while(rs.next()){
            Product p = new Product();
            p.setId(rs.getLong("id"));
            p.setTitle(rs.getString("title"));
            products.add(p);
        }
        return products;
    }
}