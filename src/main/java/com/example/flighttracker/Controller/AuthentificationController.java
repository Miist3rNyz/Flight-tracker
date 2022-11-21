package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Utilisateur;
import com.example.flighttracker.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthentificationController {
    @Autowired
    UtilisateurService service;

    @GetMapping("/Inscription")
    public String Inscription() {
        return "Inscription";
    }
    @PostMapping("/Inscription")
    public ModelAndView SaveUtilisateur(@RequestParam("username")String username, @RequestParam("password")String password){
        service.SaveUtilisateur(username,password);

        return new ModelAndView("redirect:/");
    }
    @GetMapping("/Login")
    public String Login(){
        return"Connexion";
    }
     @PostMapping("/Login")
    public ModelAndView CheckLogin(@RequestParam("username")String username, @RequestParam("password")String password) {
        if (service.CheckLogin(username, password)==true) {
            System.out.println("fonctionne");
        } else {
            return new ModelAndView("redirect:test");
        }
        return new ModelAndView("redirect:/");
    }
}
