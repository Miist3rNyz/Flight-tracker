package com.example.flighttracker.Controller;

import com.example.flighttracker.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;
    @PostMapping("/user")
    public int test(@RequestParam("username")String username, @RequestParam("password")String password){
        service.SaveUtilisateur(username,password);
        return 0;
    }
}
