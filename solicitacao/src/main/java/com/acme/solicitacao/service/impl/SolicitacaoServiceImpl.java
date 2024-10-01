package com.acme.solicitacao.service.impl;

import org.springframework.stereotype.Service;

import com.acme.solicitacao.model.Contratacao;
import com.acme.solicitacao.model.Instrumento;
import com.acme.solicitacao.model.Musico;
import com.acme.solicitacao.model.Solicitacao;
import com.acme.solicitacao.service.ContratacaoService;
import com.acme.solicitacao.service.InstrumentoService;
import com.acme.solicitacao.service.MusicoService;
import com.acme.solicitacao.service.SolicitacaoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SolicitacaoServiceImpl implements SolicitacaoService {

    private final MusicoService musicoService;
    private final InstrumentoService instrumentoService;
    private final ContratacaoService contratacaoService;

    @Override
    public Contratacao create(Solicitacao solicitacao) {
        // Cria Musico
        Musico musico = musicoService.create(solicitacao.getMusico());
        // Cria Instrumento
        Instrumento instrumento = instrumentoService.create(solicitacao.getInstrumento());
        // Cria Contratacao
        Contratacao contratacao = new Contratacao();
        contratacao.setIdMusico(musico.getId());
        contratacao.setNomeMusico(musico.getNome());
        contratacao.setIdInstrumento(instrumento.getId());
        contratacao.setNomeInstrumento(instrumento.getNome());
        contratacao.setSalario(solicitacao.getSalario());
        contratacao.setTipoContrato(solicitacao.getTipoContrato());

        return contratacaoService.create(contratacao);
    }

    // @Override
    // public Optional<Solicitacao> findById(Long id) {
    // return solicitacaoRepository.findById(id);
    // }

    // @Override
    // public List<Solicitacao> findAll() {
    // return solicitacaoRepository.findAll();
    // }

    // @Override
    // public void deleteById(Long id) {
    // solicitacaoRepository.deleteById(id);
    // }

    // @Override
    // public Solicitacao update(Solicitacao solicitacao) {
    // return solicitacaoRepository.save(solicitacao);
    // }

}
