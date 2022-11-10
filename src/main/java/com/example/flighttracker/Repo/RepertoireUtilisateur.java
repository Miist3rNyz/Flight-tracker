package com.example.flighttracker.Repo;



import com.example.flighttracker.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertoireUtilisateur extends JpaRepository<Utilisateur, Long> {

}
