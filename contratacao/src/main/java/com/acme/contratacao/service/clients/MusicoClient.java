package com.acme.contratacao.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.acme.contratacao.model.Musico;

@FeignClient("MUSICO-SERVICE")
public interface MusicoClient {
    @GetMapping("/{id}")
    Musico getById(@PathVariable("id") Long id);
}
