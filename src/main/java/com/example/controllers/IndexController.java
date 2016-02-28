package com.example.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Randall on 19/02/2016.
 */


@Controller
public class IndexController {

    protected final Log logger = LogFactory.getLog(IndexController.class);


    @RequestMapping("/")
    String index() {
        logger.info("Returning index view");
        return "index";
    }

}
