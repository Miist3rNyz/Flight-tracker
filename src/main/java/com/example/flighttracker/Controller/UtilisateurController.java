package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Utilisateur;
import com.example.flighttracker.Service.UtilisateurService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Data
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurService service;


    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        service.deleteById(id);

    }



}
