package com.jansel.microservicios.dao;

import com.jansel.microservicios.entity.Producto;
import org.springframework.data.repository.CrudRepository;


public interface ProductoDao extends CrudRepository<Producto, Long> {


}
