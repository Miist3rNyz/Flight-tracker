package com.example.flighttracker.Controller;

import com.example.flighttracker.Service.UtilisateurService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping("/home")
    public ModelAndView home(){return new ModelAndView("redirect:/");}
}
