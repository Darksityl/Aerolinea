package com.uam.Hangar69.AeroNaves;

import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenneth
 */
public class Aviones extends AeroNaves implements Cloneable{
    
    private int cantidadAsientosClaseregular;
    private int cantidadAsientosClaseregularDisponible;
    private int cantidadAsientosPrimeraClases;
    private int cantidadAsientosPrimeraClasesDisponible;
    private int cantidadAsientosNodisponibles;
    private int cantidadAsientosTotales;
    private int cantidadAsientosDisponibles;
    
    private int asientosporFila;
    private int cantidadColumnasasientos;
    private int asientosFila1;
    private int asientosFila2;
    private int asientosFila3;
    int[][] configuracionAsientos2;

    public int getCantidadAsientosClaseregularDisponible() {
        return cantidadAsientosClaseregularDisponible;
    }

    public void setCantidadAsientosClaseregularDisponible(int cantidadAsientosClaseregularDisponible) {
        this.cantidadAsientosClaseregularDisponible = cantidadAsientosClaseregularDisponible;
    }

    public int getCantidadAsientosPrimeraClasesDisponible() {
        return cantidadAsientosPrimeraClasesDisponible;
    }

    public void setCantidadAsientosPrimeraClasesDisponible(int cantidadAsientosPrimeraClasesDisponible) {
        this.cantidadAsientosPrimeraClasesDisponible = cantidadAsientosPrimeraClasesDisponible;
    }
    
 
    
    public Aviones(String nombre, String matricula, String modelo, int añofabricación, boolean activa) {
        super(nombre, matricula, modelo, añofabricación, activa);
        
    }
    
    public Aviones(int cantidadAsientosClaseregular, int cantidadAsientosPrimeraClases, int cantidadAsientosNodisponibles, int cantidadAsientosTotales, int cantidadAsientosDisponibles, int asientosporFila, int cantidadColumnasasientos, int asientosFila1, int asientosFila2, int asientosFila3, int[][] configuracionAsientos2, String nombre, String matricula, String modelo, int añofabricación, boolean activa) {
        super(nombre, matricula, modelo, añofabricación, activa);
        this.cantidadAsientosClaseregular = cantidadAsientosClaseregular;
        this.cantidadAsientosClaseregularDisponible = cantidadAsientosClaseregular;
        this.cantidadAsientosPrimeraClases = cantidadAsientosPrimeraClases;
        this.cantidadAsientosPrimeraClasesDisponible = cantidadAsientosPrimeraClases;
        this.cantidadAsientosNodisponibles = cantidadAsientosNodisponibles;
        this.cantidadAsientosTotales = cantidadAsientosTotales;
        this.cantidadAsientosDisponibles = cantidadAsientosDisponibles;
        this.asientosporFila = asientosporFila;
        this.cantidadColumnasasientos = cantidadColumnasasientos;
        this.asientosFila1 = asientosFila1;
        this.asientosFila2 = asientosFila2;
        this.asientosFila3 = asientosFila3;
        this.configuracionAsientos2 = configuracionAsientos2;
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

    public int getCantidadAsientosNodisponibles() {
        return cantidadAsientosNodisponibles;
    }

    public void setCantidadAsientosNodisponibles(int cantidadAsientosNodisponibles) {
        this.cantidadAsientosNodisponibles = cantidadAsientosNodisponibles;
    }

    public int getCantidadAsientosTotales() {
        return cantidadAsientosTotales;
    }

    public void setCantidadAsientosTotales(int cantidadAsientosTotales) {
        this.cantidadAsientosTotales = cantidadAsientosTotales;
    }

    public int getAsientosporFila() {
        return asientosporFila;
    }

    public void setAsientosporFila(int asientosporFila) {
        this.asientosporFila = asientosporFila;
    }

    public int getCantidadColumnasasientos() {
        return cantidadColumnasasientos;
    }

    public void setCantidadColumnasasientos(int cantidadColumnasasientos) {
        this.cantidadColumnasasientos = cantidadColumnasasientos;
    }

    public int getAsientosFila1() {
        return asientosFila1;
    }

    public void setAsientosFila1(int asientosFila1) {
        this.asientosFila1 = asientosFila1;
    }

    public int getAsientosFila2() {
        return asientosFila2;
    }

    public void setAsientosFila2(int asientosFila2) {
        this.asientosFila2 = asientosFila2;
    }

    public int getAsientosFila3() {
        return asientosFila3;
    }

    public void setAsientosFila3(int asientosFila3) {
        this.asientosFila3 = asientosFila3;
    }

    public int[][] getConfiguracionAsientos2() {
        return configuracionAsientos2;
    }
    

    public void setConfiguracionAsientos2(int[][] configuracionAsientos2) {
        this.configuracionAsientos2 = configuracionAsientos2;
    }
    
    

    
    public Aviones(Aviones aOriginal){
        
        super(aOriginal.getNombre(), aOriginal.getMatricula(), aOriginal.getModelo(), aOriginal.getAñofabricación(), true);
        
       this.asientosFila1=aOriginal.asientosFila1;
            this.asientosFila2=aOriginal.asientosFila2;
                 this.asientosFila3=aOriginal.asientosFila3;
                      this.asientosporFila=aOriginal.asientosporFila;
                           this.cantidadAsientosClaseregular=aOriginal.cantidadAsientosClaseregular;
                                this.cantidadAsientosClaseregularDisponible =aOriginal.cantidadAsientosClaseregularDisponible;
                                     this.cantidadAsientosDisponibles=aOriginal.cantidadAsientosDisponibles;
                                          this.cantidadAsientosNodisponibles=aOriginal.cantidadAsientosNodisponibles;
                                               this.cantidadAsientosPrimeraClases=aOriginal.cantidadAsientosPrimeraClases;
                                                   this.cantidadAsientosPrimeraClasesDisponible=aOriginal.cantidadAsientosPrimeraClasesDisponible;
                                                           this.cantidadAsientosTotales=aOriginal.cantidadAsientosTotales;
                                                                   this.cantidadColumnasasientos=aOriginal.cantidadColumnasasientos;
                                                                           
                                                                           
                                                                           
                                                                                    int[][] arraytemp =aOriginal.configuracionAsientos2;
                                                                                    int[][] array =new int[arraytemp.length][arraytemp[0].length];
                                                                                        for(int x=0;x<arraytemp.length;x++){
                                                                                        for(int y=0;y<arraytemp[0].length;y++){
                                                                                        array[x][y]=arraytemp[x][y]; 
                                                                                        }
                                                                                        }
                                                                                       this.configuracionAsientos2=array; 
                                                                                        
                                                                                        
                                                                                        
                                                                                        
     }                                                                    


   

         @Override
      public Aviones clone() throws CloneNotSupportedException{
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return(Aviones) obj;
    }
    
    
    
    
    
    
}
