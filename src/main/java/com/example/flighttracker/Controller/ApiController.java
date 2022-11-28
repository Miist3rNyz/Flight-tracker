package com.example.flighttracker.Controller;

import com.example.flighttracker.Model.Vol;
import com.example.flighttracker.Service.VolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @GetMapping("/vol")
    private String getVol() throws IOException {
        String uri = "https://opensky-network.org/api/states/all";
        RestTemplate restTemplate = new RestTemplate();

   /*     PrintWriter writer = new PrintWriter("vol.json", "UTF-8");

        */ result= restTemplate.getForObject(uri,String.class);
     /*   volService.setResultat(result);

        writer.write(result);*/
        System.out.println(result);

       return result;
    }
    @GetMapping("/list")
    private Iterable<Vol> list(){
        return volService.list();
    }


}
