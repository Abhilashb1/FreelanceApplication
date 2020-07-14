package com.freelance.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FreelanceController {
    @GetMapping(path = "/clients")
    public String getClients()
    {
        return "ABC";
    }
}
