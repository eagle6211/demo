package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adhxg on 2018/7/4.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }



}