package com.rest.api.consumidorCliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio-cliente") // Este nombre debe ser igual al nombre registrado en Eureka
public interface ConsumidorFeignClient {

    @GetMapping("/api/mensaje")
    String obtenerMensaje();
}