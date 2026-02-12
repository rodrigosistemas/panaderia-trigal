package com.panaderia.panaderiatrigal.controlador;

import com.panaderia.panaderiatrigal.modelo.Producto;
import com.panaderia.panaderiatrigal.servicio.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Producto> listaProductos(){
        return productoService.obtenerProductos();
    }
}
