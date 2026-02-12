package com.panaderia.panaderiatrigal.servicio;

import com.panaderia.panaderiatrigal.modelo.Producto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    public List<Producto> obtenerProductos(){
        List<Producto> lista = new ArrayList<>();

        lista.add(new Producto(1L,"Pan Frances",0.50));
        lista.add(new Producto(2L,"Torta de Chocolate",15.00));
        lista.add(new Producto(3L,"Croissant",2.50));

        return lista;
    }
}
