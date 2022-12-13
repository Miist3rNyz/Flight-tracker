package com.example.flighttracker.Service;


import com.example.flighttracker.Model.Vol;
import com.example.flighttracker.Repo.RepertoireVol;

import jdk.javadoc.doclet.Reporter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Service
public class VolService {

    @Autowired
    private RepertoireVol Volrepo;
   public VolService(RepertoireVol repo){
       this.Volrepo=repo;
   }
   public Iterable<Vol> list(){
       return Volrepo.findAll();
   }
   public List<Vol> ListCallsign(String name){return Volrepo.findVolByCallsign(name);}
    public List<Vol> ListOrigin(String name){return Volrepo.findVolByOrigin(name);}
    public void delete(){Volrepo.deleteAll();}
    public List<Vol> ListSol(String ground,String name){return Volrepo.findVolByGroundAndOrigin(ground,name);}

    public Vol save(Vol vol){return Volrepo.save(vol);}

}
