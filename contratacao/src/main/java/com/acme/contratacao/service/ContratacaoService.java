package com.acme.contratacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acme.contratacao.model.Contratacao;

@Service
public interface ContratacaoService {

    Contratacao create(Contratacao contratacao);

    Optional<Contratacao> findById(Long id);

    List<Contratacao> findAll();

    void deleteById(Long id);

    Contratacao update(Contratacao contratacao);
}
