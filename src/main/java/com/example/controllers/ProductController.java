package com.example.controllers;

import com.example.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Randall on 22/02/2016.
 */

@Controller
public class ProductController {

    @RequestMapping("product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());
        return "newproduct";
    }

}
