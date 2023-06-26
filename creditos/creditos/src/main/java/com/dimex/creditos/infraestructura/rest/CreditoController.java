package com.dimex.creditos.infraestructura.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimex.creditos.aplicacion.servicios.TcDimexClienteServicio;
import com.dimex.creditos.aplicacion.servicios.TrDimexSolicitudesServicio;
import com.dimex.creditos.dominio.entity.TrDimexSolicitudes;
import com.dimex.creditos.infraestructura.dto.PrincipalSolicitud;
import com.dimex.creditos.infraestructura.dto.Respuesta;

import io.micrometer.common.util.StringUtils;

@RestController
public class CreditoController {
     
    @Autowired
    TcDimexClienteServicio tcDimexClienteServicio;

    @Autowired
    TrDimexSolicitudesServicio trDimexSolicitudesServicio;

    @PostMapping("/creaSolicitud")
    public ResponseEntity<Respuesta> crearSolicitud(@RequestBody PrincipalSolicitud principalSolicitud){
        ResponseEntity regresar = null;
        if(StringUtils.isBlank(principalSolicitud.getEmpresa()) || StringUtils.isBlank(principalSolicitud.getPromotor())){
            regresar = new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.BAD_REQUEST.value()),"No se encontro la empresa , favor de validar..."),HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(principalSolicitud.getCliente().getApellidoPaterno()) || StringUtils.isBlank(principalSolicitud.getCliente().getNombre())){
            regresar = new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.BAD_REQUEST.value()),"Revisar los datos del cliente, no se encontro nombre y/o primer apellido, favor de validar..."),HttpStatus.BAD_REQUEST);
        }
        principalSolicitud.getCliente().setIdDimexPromotor(1L); // este fijo por lo que seria necesario buscar el promortor
        tcDimexClienteServicio.saveTcDimexClientes(principalSolicitud.getCliente());
        principalSolicitud.getSolicitud().setIdDimexCliente(principalSolicitud.getCliente().getIdDimexCliente());
        trDimexSolicitudesServicio.saveTrDimexSolictudes(principalSolicitud.getSolicitud());        
        regresar= new ResponseEntity(new Respuesta( String.valueOf(HttpStatus.OK.value()),"Solicitud registrada con  exitó"),HttpStatus.OK);
        return regresar;
    }
    

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }


}