package com.dimex.creditos.infraestructura.dto;

import java.io.Serializable;



public class DispersaCredito implements Serializable {
   
    private String idSolicitud;
    private int idCredito;
    private double capitalDispersado;
    private double monto;
    private double tasa;
    private int plazo;
    private String frecuencia;

     public DispersaCredito () {      

     }

     public void setCapitalDispersado(double capitalDispersado) {
         this.capitalDispersado = capitalDispersado;
     }

     public double getCapitalDispersado() {
         return capitalDispersado;
     }

     public void setIdCredito(int idCredito) {
         this.idCredito = idCredito;
     }

     public int getIdCredito() {
         return idCredito;
     }

     public void setFrecuencia(String frecuencia) {
         this.frecuencia = frecuencia;
     }
     public String getFrecuencia() {
         return frecuencia;
     }

     public void setTasa(double tasa) {
         this.tasa = tasa;
     }
    
     public double getTasa() {
         return tasa;
     }
     public void setIdSolicitud(String idSolicitud) {
         this.idSolicitud = idSolicitud;
     }

     public String getIdSolicitud() {
         return idSolicitud;
     }

     public double getMonto() {
         return monto;
     }
     public void setMonto(double monto) {
         this.monto = monto;
     }
     public int getPlazo() {
         return plazo;
     }
     
     public void setPlazo(int plazo) {
         this.plazo = plazo;
     }

}
