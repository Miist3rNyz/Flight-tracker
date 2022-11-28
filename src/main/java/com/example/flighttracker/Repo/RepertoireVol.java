package com.example.flighttracker.Repo;

import com.example.flighttracker.Model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepertoireVol extends JpaRepository<Vol,String> {
}
