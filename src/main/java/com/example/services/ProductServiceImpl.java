package com.example.services;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Randall on 19/02/2016.
 */

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> products;

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }


    @Override
    public void increasePrice(int percentage) {

        if (products != null){
            for (Product product: products){
                double newPrice = product.getPrice() * (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
