package com.dimex.creditos.infraestructura.dto;

import java.io.Serializable;

public class Motivo implements Serializable {
    
    private String codigo;
    private String descripcion;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
