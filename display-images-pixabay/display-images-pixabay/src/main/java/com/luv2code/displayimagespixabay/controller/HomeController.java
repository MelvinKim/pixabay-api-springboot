package com.luv2code.displayimagespixabay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        String PIXABAY_URL = "https://pixabay.com/api/?key=19967587-31127b7bd6e94f96e6c443586&q=BMW_CARS&image_type=photo&pretty=true";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(PIXABAY_URL, String.class);
        //System.out.println("the Response " + response.getBody());

        model.addAttribute("items", response);

        return "Home";
    }
}
