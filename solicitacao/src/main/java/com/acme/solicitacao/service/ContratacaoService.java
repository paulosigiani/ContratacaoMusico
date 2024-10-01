package com.acme.solicitacao.service;

import org.springframework.stereotype.Service;
import com.acme.solicitacao.model.Contratacao;
import com.acme.solicitacao.service.clients.ContratacaoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContratacaoService {

    private final ContratacaoClient client;

    public Contratacao getById(Long id) {
        return client.getById(id);
    }

    public Contratacao create(Contratacao contratacao) {
        return client.create(contratacao);
    }
}
