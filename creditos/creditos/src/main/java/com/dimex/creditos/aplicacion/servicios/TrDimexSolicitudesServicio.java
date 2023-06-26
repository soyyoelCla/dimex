package com.dimex.creditos.aplicacion.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dimex.creditos.aplicacion.repository.TrDimexSolicitudesRepository;

import com.dimex.creditos.dominio.entity.TrDimexSolicitudes;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TrDimexSolicitudesServicio{
  
@Autowired
TrDimexSolicitudesRepository trDimexSolicitudesRepository;

public TrDimexSolicitudes saveTrDimexSolictudes(TrDimexSolicitudes trDimexSolictudes) {  
    return trDimexSolicitudesRepository.save(trDimexSolictudes);
}

}

