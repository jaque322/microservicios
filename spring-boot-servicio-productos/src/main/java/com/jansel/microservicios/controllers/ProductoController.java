package com.jansel.microservicios.controllers;

import com.jansel.microservicios.entity.Producto;
import com.jansel.microservicios.service.ProductoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    ProductoServiceImp productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll();
    }

    @GetMapping("/detalles/{id}")
    public Producto detalles(@PathVariable Long id) {
        return productoService.findById(id);

    }


}
