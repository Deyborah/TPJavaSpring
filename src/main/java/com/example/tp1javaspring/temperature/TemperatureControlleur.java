package com.example.tp1javaspring.temperature;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temp")
public class TemperatureControlleur extends Temperature {
    private TemperatureService temperatureService;
    public TemperatureControlleur(TemperatureService temperatureService){
        this.temperatureService= temperatureService;
    }
    @GetMapping("/")
    public double gettemperature(double temperature) {
        this.Celsius = Celsius;
        this.Fahrenheit = Fahrenheit;
        this.Kelvin = Kelvin;
        return temperature;
    };

    @PostMapping("/")
        public double TemperatureConverti(){

    };


}
