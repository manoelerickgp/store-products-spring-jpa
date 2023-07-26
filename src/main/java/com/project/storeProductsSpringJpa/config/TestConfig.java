package com.project.storeProductsSpringJpa.config;

import com.project.storeProductsSpringJpa.entities.Category;
import com.project.storeProductsSpringJpa.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(1L, "Eletronics");
        Category cat2 = new Category(2L,"Books");
        //
        categoryRepository.save(cat1);
        categoryRepository.save(cat2);
    }
}
