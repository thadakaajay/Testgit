package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
import com.example.entity.EProductEntity;
import com.example.service.EProductService;

@Controller
public class EProductController {

        @Autowired
            private EProductService eproductService;
            @RequestMapping(value = "/productList", method = RequestMethod.GET)
            public String listProducts(ModelMap map)
            {
                map.addAttribute("eproduct", new EProductEntity());
                map.addAttribute("productList", eproductService.getAllProducts());
                return "productList";
            }
}

