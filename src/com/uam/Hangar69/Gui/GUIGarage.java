/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.Hangar69.Gui;

import com.uam.Hangar69.AeroNaves.RegistrarAeronaves;

/**
 *
 * @author Kenneth
 */
public class GUIGarage {
    
    public static void main(String[] args){
        
        RegistrarAeronaves registroAeronaves = new RegistrarAeronaves();
        NewJFrame crearAvion = new NewJFrame(registroAeronaves);
        crearAvion.setVisible(true);
        
        

        
        
        
    }
    
}
