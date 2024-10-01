package com.acme.contratacao.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acme.contratacao.model.Contratacao;
import com.acme.contratacao.repository.ContratacaoRepository;
import com.acme.contratacao.service.ContratacaoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContratacaoServiceImpl implements ContratacaoService {

    private final ContratacaoRepository contratacaoRepository;

    @Override
    public Contratacao create(Contratacao contratacao) {
        return contratacaoRepository.save(contratacao);
    }

    @Override
    public Optional<Contratacao> findById(Long id) {
        return contratacaoRepository.findById(id);
    }

    @Override
    public List<Contratacao> findAll() {
        return contratacaoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        contratacaoRepository.deleteById(id);
    }

    @Override
    public Contratacao update(Contratacao contratacao) {
        return contratacaoRepository.save(contratacao);
    }

}
