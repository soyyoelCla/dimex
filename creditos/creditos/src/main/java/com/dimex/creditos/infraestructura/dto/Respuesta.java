package com.dimex.creditos.infraestructura.dto;

import java.io.Serializable;

public class Respuesta implements Serializable {
 
    private String codigo;
    private String mensaje;

    public Respuesta (String codigo,String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensaje() {
        return mensaje;
    }



}
