/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.Asientos;

import com.uam.Hangar69.Gui.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author krh_9
 */
public class Asientos extends JButton implements ActionListener{
    
    Color tempcolor;
    
    public Asientos(int posx,int posy,int ancho,int alto){
        setBounds(posx, posy, ancho, alto);
        addActionListener(this);
        
    }
    
    public void SetNombre(int x ,int y){
        String nombre;
        nombre=null;
        
        if(y==0){
            nombre="A"+(x+1);
        }else if(y==1){
            nombre="B"+(x+1);
       }else if(y==2){
            nombre="C"+(x+1);
        }else if(y==3){
            nombre="D"+(x+1);
        }else if(y==4){
            nombre="E"+(x+1);
        }else if(y==5){
            nombre="F"+(x+1);
        }else if(y==6){
            nombre="G"+(x+1);
        }else if(y==7){
            nombre="H"+(x+1);
        }else if(y==8){
            nombre="I"+(x+1);
        }else if(y==9){
            nombre="J"+(x+1);
        }
        setText(nombre);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        
        
        
        if(getBackground()!=Color.YELLOW){
        
        tempcolor=getBackground();
        setBackground(Color.YELLOW);
        }else{

        setBackground(tempcolor);

        }
        
    }
    
    
    
    
    
}
