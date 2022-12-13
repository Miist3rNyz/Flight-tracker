package com.example.flighttracker.Repo;

import com.example.flighttracker.Model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepertoireVol extends JpaRepository<Vol,String> {
    List<Vol> findVolByCallsign(String name);
    List<Vol> findVolByOrigin(String name);

    List<Vol> findVolByGroundAndOrigin(String ground,String name);

}
