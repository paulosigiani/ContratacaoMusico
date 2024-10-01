package com.acme.contratacao.service;

import org.springframework.stereotype.Service;

import com.acme.contratacao.model.Musico;
import com.acme.contratacao.service.clients.MusicoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusicoService {

    private final MusicoClient client;

    public Musico getById(Long id) {
        return client.getById(id);
        // RestClient restClient = RestClient.create();
        // var serverUrl = String.format("http://localhost:8081/%d", id);
        // return restClient.get()
        // .uri(serverUrl)
        // .retrieve()
        // .toEntity(Musico.class)
        // .getBody();
    }
}
