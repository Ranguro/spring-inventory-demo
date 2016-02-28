package com.example.loaders;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Randall on 24/02/2016.
 */

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(Product.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Product cheese = new Product("1KG Cheezarella",16.99);

        productRepository.save(cheese);

        log.info("Added"+ cheese.getId() +" to my products");

        Product ham = new Product("1KG St. Charles Ham", 13.99);
        productRepository.save(ham);

        log.info("Added" + ham.getId() +" to my products");

    }
}
