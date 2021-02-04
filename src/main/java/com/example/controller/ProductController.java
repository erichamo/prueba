package com.example.controller;

import com.example.model.Client;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllClients() {
        List<Product> list = productService.getAll();
        return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id) {
        Product client = (Product) productService.getById(id);
        return new ResponseEntity<Product>(client, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> save(@Validated @RequestBody Product product) {
        Product cliente = (Product) productService.save(product);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Product> update(@Validated @RequestBody Product product) {
        Product cliente = (Product) productService.update(product);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Product> delete(@PathVariable("id") Integer id) {
        productService.delete(id);
        return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
    }
}
