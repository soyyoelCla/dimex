package com.dimex.creditos.dominio.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tc_cemex_clientes")
public class TcDimexClientes implements  Serializable {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name= "id_dimex_cliente")
   private Long idDimexCliente;   
   @Column(name="id_dimex_promotor")
   private Long idDimexPromotor; 
   @Column(name="nombre")
   private String nombre;
   @Column (name="apellido_materno")
   private String apellidoMaterno;
   @Column(name = "apellido_paterno")
   private String apellidoPaterno;   

   public  TcDimexClientes (){     

   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getNombre() {
       return nombre;
   }

   public void setApellidoMaterno(String apellidoMaterno) {
       this.apellidoMaterno = apellidoMaterno;
   }

   public String getApellidoMaterno() {
       return apellidoMaterno;
   }
 
   public void setApellidoPaterno(String apellidoPaterno) {
       this.apellidoPaterno = apellidoPaterno;
   }
   
   public void setIdDimexCliente(Long idDimexCliente) {
       this.idDimexCliente = idDimexCliente;
   }
   public Long getIdDimexCliente() {
       return idDimexCliente;
   }

   public Long getIdDimexPromotor() {
       return idDimexPromotor;
   }

   public String getApellidoPaterno() {
       return apellidoPaterno;
   }

   public void setIdDimexPromotor(Long idDimexPromotor) {
       this.idDimexPromotor = idDimexPromotor;
   }
   

  @Override
  public String toString() { 
    StringBuilder regresar= new StringBuilder();
     regresar.append("[");
     regresar.append(getIdDimexCliente());
     regresar.append("|");
	 regresar.append(getApellidoMaterno());
	 regresar.append("|");
    regresar.append(getApellidoMaterno());
    regresar.append("]");
  	return regresar.toString();
  }

}
