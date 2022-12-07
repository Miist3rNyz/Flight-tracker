package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Utilisateur;
import com.example.flighttracker.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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

    @GetMapping("/Deconnexion")
    public ModelAndView Deconnexion(HttpSession httpSession){httpSession.invalidate();return new ModelAndView("redirect:/");}

    @GetMapping("/Login")
    public String Login(){
        return"Connexion";
    }
    @PostMapping("/Login")
    public ModelAndView CheckLogin(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession httpSession) {
        if (service.CheckLogin(username, password)==true) {
            Utilisateur utilisateur = new Utilisateur(username,password);
            httpSession.setAttribute("username",utilisateur.getUsername());

        } else {        // il faut faire une redirection vers une page qui redemande le mot de passe ou le username en fonction de ce qui est faux.
            return new ModelAndView("redirect:/Login");
        }
        return new ModelAndView("redirect:/");
    }
    @GetMapping("/profile")
    public String test(HttpSession httpSession){
        if(httpSession.getAttribute("username") !=null){
            return "profile";
        }
        return "index";

    }

}
