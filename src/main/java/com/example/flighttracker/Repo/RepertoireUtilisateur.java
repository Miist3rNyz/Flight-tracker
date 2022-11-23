package com.example.flighttracker.Repo;

import com.example.flighttracker.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepertoireUtilisateur extends JpaRepository<Utilisateur, Long>  {
}
