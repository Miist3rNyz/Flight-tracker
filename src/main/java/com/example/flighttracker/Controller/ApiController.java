package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Vol;
import com.example.flighttracker.Service.VolService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class ApiController {

    private String result;

    private final VolService volService;
    public ApiController(VolService volService){
        this.volService=volService;
    }
    @GetMapping("/Vol")
    public String Vol(){
        return "Vol";
    }

    @PostMapping( "/Vol")
    private ModelAndView getVol() {
        String uri = "https://opensky-network.org/api/states/all";
        RestTemplate restTemplate = new RestTemplate();



        result= restTemplate.getForObject(uri, String.class);

        String[] test= result.split("\\[\\[");
        test = test[1].split("\\[");



        String[] resultat;
        String[] icao24=new String[test.length];
        String[] callsign=new String[test.length];
        String[] origin_Country=new String[test.length];
        String[] time_position=new String[test.length];
        String[] last_contact=new String[test.length];
        String[] longitude=new String[test.length];
        String[] lattitude=new String[test.length];
        String[] baro_altitude=new String[test.length];
        String[] on_ground=new String[test.length];
        String[] velocity=new String[test.length];
        String[] true_track=new String[test.length];
        String[] vertical_rate=new String[test.length];
        String[] sensors=new String[test.length];
        String[] geo_altitude=new String[test.length];
        String[] sqwuak=new String[test.length];
        String[] spi=new String[test.length];
        String[] position_source=new String[test.length];


        for(int i = 0 ;i< test.length; i++){
            resultat = test[i].split(",");
            resultat[16]=resultat[16].substring(0,resultat[16].length()-1);

            icao24[i]=resultat[0];
            callsign[i]=resultat[1];
            origin_Country[i]=resultat[2];
            time_position[i]=resultat[3];
            last_contact[i]=resultat[4];
            longitude[i]=resultat[5];
            lattitude[i]=resultat[6];
            baro_altitude[i]=resultat[7];
            on_ground[i]=resultat[8];
            velocity[i]=resultat[9];
            true_track[i]=resultat[10];
            vertical_rate[i]=resultat[11];
            sensors[i]=resultat[12];
            geo_altitude[i]=resultat[13];
            sqwuak[i]=resultat[14];
            spi[i]=resultat[15];
            position_source[i]=resultat[16];
            if(i==test.length-1){
                position_source[i]=position_source[i].substring(0,position_source[i].length()-2);
            }


        }
        for(int i=0; i<position_source.length;i++){
            Vol vol = new Vol(icao24[i],callsign[i],origin_Country[i],time_position[i],last_contact[i],longitude[i],lattitude[i],baro_altitude[i],on_ground[i],velocity[i],true_track[i],vertical_rate[i],sensors[i],geo_altitude[i],sqwuak[i],spi[i],position_source[i]);
            volService.save(vol);
        }
        return new ModelAndView( "redirect:/");
    }
    @GetMapping("/List")
    private String list(Model model){
        Iterable<Vol> listvol = volService.list();
        model.addAttribute("vol", listvol);

        return "List";
    }


}
