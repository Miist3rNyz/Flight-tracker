package com.example.flighttracker.Controller;

import com.example.flighttracker.Service.UtilisateurService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Data
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;


    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteById(id);

    }
    @GetMapping("/profil")
    public ModelAndView profil(){return new ModelAndView("redirect:profile");}
    @GetMapping("/home")
    public ModelAndView home(){return new ModelAndView("redirect:/");}

}
