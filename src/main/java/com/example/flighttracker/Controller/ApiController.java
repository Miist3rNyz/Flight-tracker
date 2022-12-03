package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Vol;
import com.example.flighttracker.Service.VolService;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

@RestController
@RequestMapping("/vol")
public class ApiController {

    private String result;

    private final VolService volService;
    public ApiController(VolService volService){
        this.volService=volService;
    }
    @GetMapping( "/vol")
    private void getVol() throws IOException {
        String uri = "https://opensky-network.org/api/states/all";
        RestTemplate restTemplate = new RestTemplate();

   /*     PrintWriter writer = new PrintWriter("vol.json", "UTF-8");

        */result= restTemplate.getForObject(uri, String.class);
        String[] test= result.split("\\[\\[");
        test = test[1].split("\\[");


        String[] resultat;
        for(int i = 0 ;i< test.length; i++){
            resultat = test[i].split(",");
            //resultat[0-16 sont a stocker]
        }

        //    Vol vol = new ObjectMapper().readValue(result,Vol.class);



        /*String test ="["+"ab5cb7"+","+"N831GR "+","+"United States"+",1669668065,1669668065,-115.4208,36.0772,1615.44,false,84.77,354.43,-7.48,null,1531.62,null,false,0],";
        String[] testresultat=result.split("],");
        for(int i = 0 ;i< testresultat.length; i++){
            System.out.println(testresultat[i]);
        }*/




     /*   volService.setResultat(result);

        writer.write(result);*/
      //  System.out.println(result);

       //return result;
    }
    @GetMapping("/list")
    private Iterable<Vol> list(){
        return volService.list();
    }


}
