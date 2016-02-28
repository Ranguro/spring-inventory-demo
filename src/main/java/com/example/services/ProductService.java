package com.example.services;

import com.example.domain.Product;

/**
 * Created by Randall on 19/02/2016.
 */
public interface ProductService {

    public void increasePrice(int percentage);

    Iterable<Product> listAllProducts();

}
