package com.example.repositories;

import com.example.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Randall on 24/02/2016.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByDescription(String description);

}

