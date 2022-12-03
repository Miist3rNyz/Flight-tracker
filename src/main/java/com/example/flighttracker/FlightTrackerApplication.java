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


}
