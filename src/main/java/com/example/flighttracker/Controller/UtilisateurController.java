package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Utilisateur;
import com.example.flighttracker.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;
    @PostMapping("/user")
    public int test(@RequestParam("username")String username, @RequestParam("password")String password){
        service.SaveUtilisateur(username,password);
        Utilisateur utilisateur = new Utilisateur(username,password);
        service.RemoveUtilisateur(utilisateur);
        return 0;
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        service.deleteById(id);

    }
}
