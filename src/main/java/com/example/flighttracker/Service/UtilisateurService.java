package com.example.flighttracker.Service;

import com.example.flighttracker.Model.Utilisateur;
import com.example.flighttracker.Repo.RepertoireUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UtilisateurService {
    @Autowired
    private RepertoireUtilisateur repo;
    private BCryptPasswordEncoder passwordEncoder;
    public void SaveUtilisateur(String username, String password){
        Utilisateur user = new Utilisateur();
        passwordEncoder = new BCryptPasswordEncoder();
        password=passwordEncoder.encode(password);
        user.setUsername(username);
        user.setPassword(password);
        repo.save(user);

    }

    public void deleteById(Long id){
        repo.deleteById(id);
    }
    public boolean CheckLogin(String username, String password){
        for (Utilisateur utilisateur : repo.findAll()) {
            passwordEncoder = new BCryptPasswordEncoder();
            if(utilisateur.getUsername().equals(username) && passwordEncoder.matches(password,utilisateur.getPassword())){
                return true;
            }
        }
        return false;

    }
}
