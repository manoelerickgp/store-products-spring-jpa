package com.project.storeProductsSpringJpa.config;

import com.project.storeProductsSpringJpa.entities.Category;
import com.project.storeProductsSpringJpa.entities.Product;
import com.project.storeProductsSpringJpa.repositories.CategoryRepository;
import com.project.storeProductsSpringJpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null,"Books");
        //
        Product p1 = new Product(null, "TV", 2200.00, cat1);
        Product p2 = new Product(null, "Domain Driven Design", 120.00, cat2);
        Product p3 = new Product(null, "PS5", 2800.00, cat1);
        Product p4 = new Product(null, "Docker", 100.00, cat2);
        //
        cat1.getProducts().addAll(Arrays.asList(p1, p3));
        cat2.getProducts().addAll(Arrays.asList(p2, p4));
        //
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
        //
        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
        //

    }
}
