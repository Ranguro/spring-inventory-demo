package com.example.loaders;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Randall on 24/02/2016.
 */
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(Product.class);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Product cheese = new Product();
        cheese.setDescription("1KG Cheezarella");
        cheese.setPrice(16.99);
        productRepository.save(cheese);

        Product ham = new Product();
        ham.setDescription("1KG St. Charles Ham");
        ham.setPrice(13.99);
        productRepository.save(ham);

    }
}
