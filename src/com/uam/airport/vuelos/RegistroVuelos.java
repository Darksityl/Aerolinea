/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.vuelos;

import java.util.LinkedList;

/**
 *
 * @author Kenneth
 */
public class RegistroVuelos {
    
    public LinkedList<Vuelos> listaVuelos = new LinkedList();
    
    
    public void add(Vuelos nVuelos){
        listaVuelos.add(nVuelos);
    }
    
    public Vuelos get(int nVuelos){
    return(Vuelos) listaVuelos.get(nVuelos);
    }
    
    
    public Vuelos getbyCodigo(String nVuelos){
    int temp=0;
    for(int i=0;i<sizeVuelos();i++){
      if(listaVuelos.get(i).getCodigoVuelo()==nVuelos){
          temp=i;
      }  
    }
    return(Vuelos) listaVuelos.get(temp);
    }
    
    
    
    public int sizeVuelos(){
        return this.listaVuelos.size();
    }
    
    
    
    
    
    
}
