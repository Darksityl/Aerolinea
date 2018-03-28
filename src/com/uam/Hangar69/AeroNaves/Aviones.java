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
public class Aviones extends AeroNaves{
    
    private int cantidadAsientosClaseregular;
    private int cantidadAsientosPrimeraClases;
    private int cantidadAsientosDisponibles;
    private int configuracionAsientosF;
    private int configuracionAsientosC;
    private int[]Filas;


    public Aviones(int cantidadAsientosClaseregular, int cantidadAsientosPrimeraClases, int configuracionAsientosF, int configuracionAsientosFila1,int configuracionAsientosFila2
            ,int configuracionAsientosFila3, String nombre, String matricula, String modelo, int añofabricación, boolean activa) {
        super(nombre, matricula, modelo, añofabricación, activa);
        this.cantidadAsientosClaseregular = cantidadAsientosClaseregular;
        this.cantidadAsientosPrimeraClases = cantidadAsientosPrimeraClases;
        this.configuracionAsientosF = configuracionAsientosF;
        Filas= new int[configuracionAsientosF+1];
        if(configuracionAsientosF==0){
        Filas[0]= configuracionAsientosFila1;  
        }else if(configuracionAsientosF==1){
        Filas[0]= configuracionAsientosFila1;
        Filas[1]= configuracionAsientosFila2;
        }else if(configuracionAsientosF==2){
        Filas[0]= configuracionAsientosFila1;
        Filas[1]= configuracionAsientosFila2;
        Filas[2]= configuracionAsientosFila3;
        }

    }
 
    public int getCantidadAsientosClaseregular() {
        return cantidadAsientosClaseregular;
    }

    public void setCantidadAsientosClaseregular(int cantidadAsientosClaseregular) {
        this.cantidadAsientosClaseregular = cantidadAsientosClaseregular;
    }

    public int getCantidadAsientosPrimeraClases() {
        return cantidadAsientosPrimeraClases;
    }

    public void setCantidadAsientosPrimeraClases(int cantidadAsientosPrimeraClases) {
        this.cantidadAsientosPrimeraClases = cantidadAsientosPrimeraClases;
    }

    public int getCantidadAsientosDisponibles() {
        return cantidadAsientosDisponibles;
    }

    public void setCantidadAsientosDisponibles(int cantidadAsientosDisponibles) {
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
    }

    public int getConfiguracionAsientosF() {
        return configuracionAsientosF;
    }

    public void setConfiguracionAsientosF(int configuracionAsientosF) {
        this.configuracionAsientosF = configuracionAsientosF;
    }

    public int getConfiguracionAsientosC() {
        return configuracionAsientosC;
    }

    public void setConfiguracionAsientosC(int configuracionAsientosC) {
        this.configuracionAsientosC = configuracionAsientosC;
    }


    
    
    
    
    
    
}
