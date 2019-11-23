package com.eugkhay.gadgets_shop.controllers;

import com.eugkhay.gadgets_shop.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class IndexController {

    @GetMapping
    public String get() {
        return "Test main page of SocksStore";
    }
}
