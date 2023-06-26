package com.dimex.creditos.dominio.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tr_dimex_solicitudes")
public class TrDimexSolicitudes implements Serializable{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name= "id_dimex_solicitud")
   private Long idDimexSolicitud;
   
   @Column(name="id_dimex_cliente")
   private Long idDimexCliente; 

   @Column(name="monto")
   private Double monto;
 
   @Column(name="idDimexTipoSolicitud")
   private Long idDimexTipoSolicitud;
   @Column(name="producto")
   private String producto;
   @Column(name="tasa")
   private Double tasa;
   @Column(name="plazo")
   private Integer plazo;
   @Column(name="frecuencia")
   private String frecuencia;
   @Column(name="fechaSolitud")
   private String fechaSolitud;

   
   public TrDimexSolicitudes () {

   }

   public String getFechaSolitud() {
       return fechaSolitud;
   }

   public void setFechaSolitud(String fechaSolitud) {
       this.fechaSolitud = fechaSolitud;
   }
   public String getFrecuencia() {
       return frecuencia;
   }
   public void setFrecuencia(String frecuencia) {
       this.frecuencia = frecuencia;
   }
   public Long getIdDimexCliente() {
       return idDimexCliente;
   }
   
   public void setIdDimexCliente(Long idDimexCliente) {
       this.idDimexCliente = idDimexCliente;
   }

   public Long getIdDimexSolicitud() {
       return idDimexSolicitud;
   }

   public void setIdDimexSolicitud(Long idDimexSolicitud) {
       this.idDimexSolicitud = idDimexSolicitud;
   }

   public Long getIdDimexTipoSolicitud() {
       return idDimexTipoSolicitud;
   }

   public void setIdDimexTipoSolicitud(Long idDimexTipoSolicitud) {
       this.idDimexTipoSolicitud = idDimexTipoSolicitud;
   }

   public Double getMonto() {
       return monto;
   }

   public void setMonto(Double monto) {
       this.monto = monto;
   }

   public void setPlazo(Integer plazo) {
       this.plazo = plazo;
   }
   
   public Integer getPlazo() {
       return plazo;
   }
   
   public void setProducto(String producto) {
       this.producto = producto;
   }

   public String getProducto() {
       return producto;
   }

   public void setTasa(Double tasa) {
       this.tasa = tasa;
   }

   public Double getTasa() {
       return tasa;
   }

@Override
  public String toString() { 
    StringBuilder regresar= new StringBuilder();
     regresar.append("[");
     regresar.append(getIdDimexSolicitud());
     regresar.append("|");
	 regresar.append(getIdDimexCliente());
	 regresar.append("|");
    regresar.append(getIdDimexTipoSolicitud());
    regresar.append("]");
  	return regresar.toString();
  }
}
