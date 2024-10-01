package com.acme.solicitacao.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.acme.solicitacao.model.Musico;

@FeignClient("MUSICO-SERVICE")
public interface MusicoClient {
    @GetMapping("/{id}")
    Musico getById(@PathVariable("id") Long id);

    @PostMapping
    Musico create(@RequestBody Musico musico);
}
