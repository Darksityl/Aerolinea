/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.Hangar69.AeroNaves;

/**
 *
 * @author Kenneth
 */
public class AeroNaves {
    
    private String nombre;
    private String matricula;
    private String modelo;
    private int añofabricación;
    private boolean activa;
    private String tipos;
    
    


    public AeroNaves(String nombre, String matricula, String modelo, int añofabricación, boolean activa) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.modelo = modelo;
        this.añofabricación = añofabricación;
        this.activa = activa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñofabricación() {
        return añofabricación;
    }

    public void setAñofabricación(int añofabricación) {
        this.añofabricación = añofabricación;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
    
    
    
    
}
