package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        // This should be replaced with actual data retrieval logic
        return Arrays.asList(
                new Product("Item 1", "$10", "Description of Item 1", "In Stock"),
                new Product("Item 2", "$20", "Description of Item 2", "Out of Stock"));
    }
}
