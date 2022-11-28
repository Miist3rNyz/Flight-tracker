package com.example.flighttracker;

import com.example.flighttracker.Model.Vol;
import com.example.flighttracker.Service.VolService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class FlightTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightTrackerApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(VolService volService) {
        return args -> {

           ObjectMapper mapper = new ObjectMapper();

            TypeReference<List<Vol>> typeReference = new TypeReference<List<Vol>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/vol.json");
            try {
                List<Vol> vols = mapper.readValue(inputStream,typeReference);
                volService.save(vols);
                System.out.println("Users Saved!");
            } catch (IOException e){
                System.out.println("Unable to save users: " + e.getMessage());
            }
        };
    }

}
