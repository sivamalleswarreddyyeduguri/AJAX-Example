package com.zettamine.ecmerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search")
    public String searchProducts(@RequestParam String query) {
        // Simulate a search process in a database or service
        if (query.equalsIgnoreCase("Laptop")) {
            return "<ul><li>Gaming Laptop</li><li>Ultrabook Laptop</li></ul>";
        } else if (query.equalsIgnoreCase("Phone")) {
            return "<ul><li>Smartphone</li><li>Basic Phone</li></ul>";
        } else {
            return "<p>No products found for \"" + query + "\"</p>";
        }
    }
}

