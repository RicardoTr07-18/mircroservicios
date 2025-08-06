package com.rest.api.consumidorCliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumidorController {

    private final ConsumidorFeignClient consumidorFeignClient;

    public ConsumidorController(ConsumidorFeignClient consumidorFeignClient) {
        this.consumidorFeignClient = consumidorFeignClient;
    }

    @GetMapping("/mensaje-desde-ejemplo")
    public String mensajeDesdeEjemplo() {
        return consumidorFeignClient.obtenerMensaje();
    }
}