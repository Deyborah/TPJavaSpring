package com.example.tp1javaspring.temperature;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService extends Temperature {

    public double TemperatureAConvertir(double TemperatureAConvertir){
        Fahrenheit = Celsius * 1.8 + 32;
        Kelvin = Celsius + 273.15;
        Celsius = Kelvin - 273.15;
        Celsius = (Fahrenheit - 32) / 1.8;
        return TemperatureAConvertir;
    };
}