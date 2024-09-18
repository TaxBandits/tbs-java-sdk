package com.form1099K.sdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Navigate to Home
     * Page Name: /
     * Method: GET
     **/
    @GetMapping("/")
    public String welcome() {
        return "home";
    }

    /**
     * Navigate to Home
     * Page Name: /home
     * Method: GET
     **/
    @GetMapping("/home")
    public String home() {
        return "home";
    }

}
