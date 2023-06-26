package com.dimex.creditos.aplicacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dimex.creditos.dominio.entity.TcDimexClientes;

@Repository
public interface  TcDimexClientesRepository  extends  JpaRepository<TcDimexClientes, Long> {

    


}
