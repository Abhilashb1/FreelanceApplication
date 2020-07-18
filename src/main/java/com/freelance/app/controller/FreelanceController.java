package com.freelance.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController

public class FreelanceController {

    @GetMapping(path = "/clients")
    public String getClients()
    {
        return "ABC";
    }

    @GetMapping(path = "/clients/{id}")
    public String getClient()
    {
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand().toUri();
        ResponseEntity.created(location);
        return "ABC";

    }

    @PostMapping(path = "/addUser")
    public String addUser()
    {
        return "ABC";
    }


}
