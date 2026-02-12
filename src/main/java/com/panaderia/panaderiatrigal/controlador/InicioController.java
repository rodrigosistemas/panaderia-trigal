package com.panaderia.panaderiatrigal.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/")
    public String inicio(){
        return """
                Bienvenidos a la API de Panaderia el Trigal<br>
                Endpoints disponibles: <br>
                /productos -> Lista de productos <br>        
                """;
    }
}
