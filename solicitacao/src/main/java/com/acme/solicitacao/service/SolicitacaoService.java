package com.acme.solicitacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acme.solicitacao.model.Contratacao;
import com.acme.solicitacao.model.Solicitacao;

@Service
public interface SolicitacaoService {

    Contratacao create(Solicitacao solicitacao);

    // Optional<Solicitacao> findById(Long id);

    // List<Solicitacao> findAll();

    // void deleteById(Long id);

    // Solicitacao update(Solicitacao solicitacao);
}
