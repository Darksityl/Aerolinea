/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.Hangar69.Gui;

import com.uam.Hangar69.AeroNaves.RegistrarAeronaves;
import com.uam.Hangar69.AeroNaves.Aviones;
import com.uam.Hangar69.AeroNaves.Helicopteros;

/**
 *
 * @author Kenneth
 */
public class GUIGarage {
    
    public static void main(String[] args){
        
        RegistrarAeronaves registroAeronaves = new RegistrarAeronaves();
        
        
        
        
        
        Aviones NuevoAvion = new Aviones(0, 0, 3, 3, 0, 0, "", "", "", 0, true);
        Aviones NuevoAvion2 = new Aviones(1,1,1,1,2,2,"Nave 2","N-201","2000",1,true);
        Helicopteros nuevoHelicoptero = new Helicopteros(1, 1, 2, 2, "Helicoptero1", "Hlp-200", "200", 1, true);

        registroAeronaves.addAvion(NuevoAvion);
        registroAeronaves.addAvion(NuevoAvion2);
        registroAeronaves.addHelicotero(nuevoHelicoptero);
        System.out.println(registroAeronaves.getAvion(0).getClass());
        
        registroAeronaves.ImprimirAviones();
        
        NewJFrame crearAvion = new NewJFrame(registroAeronaves);
        crearAvion.setVisible(true);
        
        

        
        
        
    }
    
}
