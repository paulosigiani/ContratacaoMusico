package com.acme.solicitacao.service;

import org.springframework.stereotype.Service;

import com.acme.solicitacao.model.Musico;
import com.acme.solicitacao.service.clients.MusicoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusicoService {

    private final MusicoClient client;

    public Musico getById(Long id) {
        return client.getById(id);
    }

    public Musico create(Musico musico) {
        return client.create(musico);
    }
}
