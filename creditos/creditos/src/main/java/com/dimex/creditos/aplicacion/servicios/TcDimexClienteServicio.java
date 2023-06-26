package com.dimex.creditos.aplicacion.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimex.creditos.aplicacion.repository.TcDimexClientesRepository;
import com.dimex.creditos.dominio.entity.TcDimexClientes;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TcDimexClienteServicio{
  
@Autowired
TcDimexClientesRepository tcDimexClientesRepository;

public TcDimexClientes saveTcDimexClientes(TcDimexClientes tcDimexClientes){
  
    return tcDimexClientesRepository.save(tcDimexClientes);

}

}

