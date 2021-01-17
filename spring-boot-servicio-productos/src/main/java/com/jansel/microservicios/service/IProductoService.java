package com.jansel.microservicios.service;

import com.jansel.microservicios.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> findAll();

    Producto findById(Long id);
}
