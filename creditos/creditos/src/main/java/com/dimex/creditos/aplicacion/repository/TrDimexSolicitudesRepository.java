package com.dimex.creditos.aplicacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dimex.creditos.dominio.entity.TrDimexSolicitudes;

@Repository
public interface  TrDimexSolicitudesRepository  extends  JpaRepository<TrDimexSolicitudes, Long> {

}
