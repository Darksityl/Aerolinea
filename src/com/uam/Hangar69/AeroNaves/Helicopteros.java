package com.uam.Hangar69.AeroNaves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenneth
 */
public class Helicopteros extends AeroNaves{
    
    private int cantidadAsientos;
    private int cantidadAsientosDisponibles;
    private int configuracionAsientosDelanteros;
    private int configuracionAsientosTraseros;

    public Helicopteros(int cantidadAsientos, int cantidadAsientosDisponibles, int configuracionAsientosDelanteros, int configuracionAsientosTraseros, String nombre, String matricula, String modelo, int añofabricación, boolean activa) {
        super(nombre, matricula, modelo, añofabricación, activa);
        this.cantidadAsientos = cantidadAsientos;
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
        this.configuracionAsientosDelanteros = configuracionAsientosDelanteros;
        this.configuracionAsientosTraseros = configuracionAsientosTraseros;
    }


    
    
    
    
}
