package com.acme.contratacao.service;

import org.springframework.stereotype.Service;
import com.acme.contratacao.model.Instrumento;
import com.acme.contratacao.service.clients.InstrumentoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstrumentoService {

    private final InstrumentoClient client;

    public Instrumento getById(Long id) {
        return client.getById(id);
        // RestClient restClient = RestClient.create();
        // var serverUrl = String.format("http://localhost:8081/%d", id);
        // return restClient.get()
        // .uri(serverUrl)
        // .retrieve()
        // .toEntity(Instrumento.class)
        // .getBody();
    }
}
