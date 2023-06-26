package com.dimex.creditos.infraestructura.dto;

import java.io.Serializable;

import com.dimex.creditos.dominio.entity.TcDimexClientes;
import com.dimex.creditos.dominio.entity.TrDimexSolicitudes;

public class PrincipalSolicitud implements Serializable {
    
    public String promotor;
    public String empresa;
    public TcDimexClientes  cliente;
    public TrDimexSolicitudes solicitud;

    public PrincipalSolicitud() {
      this.cliente   = new Cliente();
      this.solicitud = new Solicitud();
    }

    public void setCliente(TcDimexClientes cliente) {
        this.cliente = cliente;
    }

    public TcDimexClientes getCliente() {
        return cliente;
    }

    public void setSolicitud(TrDimexSolicitudes solicitud) {
        this.solicitud = solicitud;
    }

    public TrDimexSolicitudes getSolicitud() {
        return solicitud;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getPromotor() {
        return promotor;
    }



    @Override
     public String toString() {
         // TODO Auto-generated method stub
         return super.toString();
     }

}
