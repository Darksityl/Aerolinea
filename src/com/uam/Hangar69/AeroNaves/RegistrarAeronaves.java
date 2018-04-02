/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.Hangar69.AeroNaves;

import java.util.LinkedList;

/**
 *
 * @author Kenneth
 */
public class RegistrarAeronaves {
    
   public LinkedList<AeroNaves> listaAviones = new LinkedList();
   public LinkedList<AeroNaves> listaHelicopteros = new LinkedList();
   public LinkedList<AeroNaves> listaAeronaves = new LinkedList();  
   private LinkedList<Aviones> avionesConfigurados = new LinkedList();
   
   
   
    public RegistrarAeronaves(){
        
        Aviones AIRBUSA380 = new Aviones( "AIRBUS A380", "", "", 0, true);
        Aviones BOEING747 = new Aviones("BOEING 747", "", "", 0, true);
        
        avionesConfigurados.add(AIRBUSA380);
        avionesConfigurados.add(BOEING747);
    }
    
    
    
    public Aviones getAvionesRegistrados(int pAvion){
    return(Aviones) avionesConfigurados.get(pAvion);
    }
    public int sizeAvionesRegistrados(){
        return this.avionesConfigurados.size();
    }
    
    
    

    public void addAeronave(AeroNaves pAero){
        this.listaAeronaves.add(pAero);
    }
    

    
    
    
    public void addAvion(AeroNaves pAero){
    this.listaAviones.add(pAero);
    }
    public int sizeAvion(){
        return this.listaAviones.size();
    }
    public void deleteAvion(int x){
    this.listaAviones.remove(x);
}
    public void isEmptyAvion(){
        this.listaAeronaves.isEmpty();
    }
    public void ImprimirAviones(){
        for(int x = 0; this.listaAviones.size()>x;x++){
            System.out.println(getAvion(x).getNombre());
        }
        
        
    }
    public Aviones getAvion(int pAvion){
    return(Aviones) listaAviones.get(pAvion);
    }
    
    
    
    
    public void addHelicotero(AeroNaves pAero){
    this.listaHelicopteros.add(pAero);
    }
    

    
    
    
}
