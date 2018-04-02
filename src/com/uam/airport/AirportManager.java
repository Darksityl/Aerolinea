/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport;

import com.uam.Hangar69.AeroNaves.RegistrarAeronaves;
import com.uam.Hangar69.Gui.NewJFrame;

/**
 *
 * @author Kenneth
 */
public class AirportManager {
    
        RegistrarAeronaves registroAeronaves = new RegistrarAeronaves();
        NewJFrame crearAvion = new NewJFrame(registroAeronaves);
    
}
