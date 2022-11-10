package com.example.flighttracker.Controller;

import com.example.flighttracker.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;
    @GetMapping("/user")
    public int test(){
        service.SaveUtilisateur();
        return 0;
    }
}
