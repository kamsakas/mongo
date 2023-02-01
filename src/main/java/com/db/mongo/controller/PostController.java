package com.db.mongo.controller;

import com.db.mongo.ProductRepository;
import com.db.mongo.model.product;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

   @Autowired
    ProductRepository repo;

   @GetMapping("/prod")
    public List<product> getAllProducts(){
       return repo.findAll();
    }

    @GetMapping("/hello")
    public String hell(){
       return "Helloworld";
    }
/*    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
       response.sendRedirect("/swagger-ui.html");
    }

*/


    
}
