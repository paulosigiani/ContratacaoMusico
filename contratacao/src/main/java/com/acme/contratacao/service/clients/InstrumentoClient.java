package com.acme.contratacao.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.acme.contratacao.model.Instrumento;

@FeignClient("MUSICO-SERVICE")
public interface InstrumentoClient {
    @GetMapping("/{id}")
    Instrumento getById(@PathVariable("id") Long id);
}
