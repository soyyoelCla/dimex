package com.dimex.creditos.infraestructura.dto;

import java.io.Serializable;
import java.util.List;


public class EstatusSolicitud implements Serializable {
   
    private String idSolicitud;
    private String idEsatus;
    private List<Motivo> motivo;
    private String fechaCambio;

     public EstatusSolicitud () {      

     }

     

     public void setFechaCambio(String fechaCambio) {
         this.fechaCambio = fechaCambio;
     }

     public String getFechaCambio() {
         return fechaCambio;
     }

     public void setIdEsatus(String idEsatus) {
         this.idEsatus = idEsatus;
     }

     public String getIdEsatus() {
         return idEsatus;
     }

     public void setIdSolicitud(String idSolicitud) {
         this.idSolicitud = idSolicitud;
     }

     public String getIdSolicitud() {
         return idSolicitud;
     }

     public void setMotivo(List<Motivo> motivo) {
         this.motivo = motivo;
     }

     public List<Motivo> getMotivo() {
         return motivo;
     }
    
    
}
