package com.acme.solicitacao.service;

import org.springframework.stereotype.Service;
import com.acme.solicitacao.model.Instrumento;
import com.acme.solicitacao.service.clients.InstrumentoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstrumentoService {

    private final InstrumentoClient client;

    public Instrumento getById(Long id) {
        return client.getById(id);
    }

    public Instrumento create(Instrumento instrumento) {
        return client.create(instrumento);
    }
}
