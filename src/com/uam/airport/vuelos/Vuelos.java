/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uam.airport.vuelos;

import com.uam.Hangar69.AeroNaves.Aviones;
import com.uam.airport.Asientos.AsientosReservados;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kenneth
 */
public class Vuelos {
    
    private Aviones aviondelVuelo;
    private String piloto;
    private int precioPrimera, precioTurista;
    private String duracion;
    private Calendar salida;
    private Calendar llegada;
    private String horasLlegada;
    private String horasSalida;
    private int minutosLlegada;
    private int minutosSalida;
    private String destino;
    private String origen;
    private int dias,horas,minutos; //Duration
    private String codigoVuelo;
    LinkedList<AsientosReservados> asientosReservados= new LinkedList<>();
    
    public void addAsientosReservados(AsientosReservados x){
        this.asientosReservados.add(x);
    }

    public List<AsientosReservados> getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(LinkedList<AsientosReservados> asientosReservados) {
        this.asientosReservados = asientosReservados;
    }
    
    public AsientosReservados getbyCodigo(String pNombreCompra){
    int temp=0;
    for(int i=0;i<sizeAsientosReservados();i++){
      if(asientosReservados.get(i).getNombreCompra()==pNombreCompra){
          temp=i;
      }  
    }
    return(AsientosReservados) asientosReservados.get(temp);
    }
        
    public AsientosReservados get(int nVuelos){
    return(AsientosReservados) asientosReservados.get(nVuelos);
    }
        
        
        
    
    
    
    public AsientosReservados getAsientosReservados(int x){
        return asientosReservados.get(x);
    }
        public int sizeAsientosReservados(){
        return this.asientosReservados.size();
    }
    public void deleteAsientosReservados(int x){
    this.asientosReservados.remove(x);
}
    public boolean isEmptyAsientosReservados(){
        return this.asientosReservados.isEmpty();
    }
    
    

    public Vuelos(Aviones aviondelVuelo, Calendar salida, Calendar llegada, String destino, String origen, int dias, int horas, int minutos) {
        this.aviondelVuelo = aviondelVuelo;
        this.salida = salida;
        this.llegada = llegada;
        this.destino = destino;
        this.origen = origen;
        this.dias = dias;
        this.horas = horas;
        this.minutos = minutos;
    }

    public Aviones getAviondelVuelo() {
        return aviondelVuelo;
    }

    public void setAviondelVuelo(Aviones aviondelVuelo) {
        this.aviondelVuelo = aviondelVuelo;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getPrecioPrimera() {
        return precioPrimera;
    }

    public void setPrecioPrimera(int precioPrimera) {
        this.precioPrimera = precioPrimera;
    }

    public int getPrecioTurista() {
        return precioTurista;
    }

    public void setPrecioTurista(int precioTurista) {
        this.precioTurista = precioTurista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Calendar getSalida() {
        return salida;
    }

    public void setSalida(Calendar salida) {
        this.salida = salida;
    }

    public Calendar getLlegada() {
        return llegada;
    }

    public void setLlegada(Calendar llegada) {
        this.llegada = llegada;
    }

    public String getHorasLlegada() {
        return horasLlegada;
    }

    public void setHorasLlegada(String horasLlegada) {
        this.horasLlegada = horasLlegada;
    }

    public String getHorasSalida() {
        return horasSalida;
    }

    public void setHorasSalida(String horasSalida) {
        this.horasSalida = horasSalida;
    }

    public int getMinutosLlegada() {
        return minutosLlegada;
    }

    public void setMinutosLlegada(int minutosLlegada) {
        this.minutosLlegada = minutosLlegada;
    }

    public int getMinutosSalida() {
        return minutosSalida;
    }

    public void setMinutosSalida(int minutosSalida) {
        this.minutosSalida = minutosSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    
 

   
    

    
    
    
    
    

}
