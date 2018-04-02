/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport;

import com.uam.Hangar69.AeroNaves.RegistrarAeronaves;
import com.uam.Hangar69.Gui.GUIGarage;
import com.uam.airport.vuelos.RegistroVuelos;

/**
 *
 * @author Kenneth
 */
public class AirportManager {
    
       public static RegistrarAeronaves registroAeronaves = new RegistrarAeronaves();
       public static  RegistroVuelos listaVuelos = new RegistroVuelos();
        
        
        
        

                
                
  public static void main(String[] args){
        Main mainmenu = new Main(registroAeronaves,listaVuelos);
        mainmenu.setVisible(true);
 }
    
}
