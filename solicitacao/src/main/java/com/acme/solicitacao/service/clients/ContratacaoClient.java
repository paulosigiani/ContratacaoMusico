package com.acme.solicitacao.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.acme.solicitacao.model.Contratacao;

@FeignClient("CONTRATACAO-SERVICE")
public interface ContratacaoClient {
    @GetMapping("/{id}")
    Contratacao getById(@PathVariable("id") Long id);

    @PostMapping
    Contratacao create(@RequestBody Contratacao contratacao);
}
