package com.edwincodex.twitter.timeline.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PortfolioController {

    @RequestMapping(value="test")
    public List<String> test(){
        return List.of("Apple", "Banana", "Kiwi");
    }
}
