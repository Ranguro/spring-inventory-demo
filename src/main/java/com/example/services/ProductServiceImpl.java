package com.example.services;

import com.example.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Randall on 19/02/2016.
 */

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> products;

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public void increasePrice(int percentage) {

        if (products != null){
            for (Product product: products){
                double newPrice = product.getPrice().doubleValue() * (100 + percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
