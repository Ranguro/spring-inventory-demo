package com.example.controllers;

import com.example.domain.Product;
import com.example.services.ProductServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Randall on 19/02/2016.
 */

@Controller
public class InventoryController{

    protected final Log logger = LogFactory.getLog(getClass());

    private ProductServiceImpl productService;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){

        Map<String, List<Product>> myModel = new HashMap<String, List<Product>>();

        myModel.put("products", productService.getProducts());
        return new ModelAndView("hello", "model", myModel);
    }

    public void setProductService(ProductServiceImpl productService) {
        this.productService = productService;
    }
}
