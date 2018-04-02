/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.vuelos;

import com.uam.Hangar69.AeroNaves.Aviones;
import java.util.Calendar;

/**
 *
 * @author Kenneth
 */
public class Vuelos {
    
    private Aviones aviondelVuelo;
    private Calendar salida;
    private Calendar llegada;
    private int horasLlegada;
    private int horasSalida;
    private int minutosLlegada;
    private int minutosSalida;
    private String destino;
    private String origen;
    private int dias,horas,minutos; //Duration

    public Vuelos(Aviones aviondelVuelo, Calendar salida, Calendar llegada, int horasLlegada, int horasSalida, int minutosLlegada, int minutosSalida, String destino, String origen, int dias, int horas, int minutos) {
        this.aviondelVuelo = aviondelVuelo;
        this.salida = salida;
        this.llegada = llegada;
        this.horasLlegada = horasLlegada;
        this.horasSalida = horasSalida;
        this.minutosLlegada = minutosLlegada;
        this.minutosSalida = minutosSalida;
        this.destino = destino;
        this.origen = origen;
        this.dias = dias;
        this.horas = horas;
        this.minutos = minutos;
    }

    
 

   
    

    
    
    
    
    

}
