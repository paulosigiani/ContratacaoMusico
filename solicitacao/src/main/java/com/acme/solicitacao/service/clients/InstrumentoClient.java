package com.acme.solicitacao.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.acme.solicitacao.model.Instrumento;

@FeignClient("INSTRUMENTO-SERVICE")
public interface InstrumentoClient {
    @GetMapping("/{id}")
    Instrumento getById(@PathVariable("id") Long id);

    @PostMapping
    Instrumento create(@RequestBody Instrumento instrumento);
}
