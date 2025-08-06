package com.rest.api.cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @GetMapping("/mensaje")
    public String mensaje() {
        return "Hola desde el servicio-ejemplo!";
    }
}
