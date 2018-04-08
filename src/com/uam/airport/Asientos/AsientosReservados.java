/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.Asientos;

/**
 *
 * @author Kenneth
 */
public class AsientosReservados {
    
    private String nombreCompra;
    private String asiento;

    public AsientosReservados(String nombreCompra, String asiento) {
        this.nombreCompra = nombreCompra;
        this.asiento = asiento;
    }

    public String getNombreCompra() {
        return nombreCompra;
    }

    public void setNombreCompra(String nombreCompra) {
        this.nombreCompra = nombreCompra;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
    
    
}
