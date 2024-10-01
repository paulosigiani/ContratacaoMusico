package com.acme.solicitacao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.solicitacao.model.Contratacao;
import com.acme.solicitacao.model.Solicitacao;
import com.acme.solicitacao.service.SolicitacaoService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SolicitacaoController {

    private final SolicitacaoService solicitacaoService;

    // @GetMapping
    // public ResponseEntity<?> findAll() {
    // return ResponseEntity.ok(solicitacaoService.findAll());
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<?> findById(@PathVariable Long id) {
    // Optional<Solicitacao> optSolicitacao = solicitacaoService.findById(id);
    // if (optSolicitacao.isPresent()) {
    // return ResponseEntity.ok(optSolicitacao.get());
    // } else {
    // return ResponseEntity.notFound().build();
    // }
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<?> delete(@PathVariable Long id) {
    // solicitacaoService.deleteById(id);
    // return ResponseEntity.ok().build();
    // }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Solicitacao solicitacao) {
        Contratacao created = solicitacaoService.create(solicitacao);
        return ResponseEntity.ok(created);
    }

    // @PutMapping
    // public ResponseEntity<?> update(@RequestBody Solicitacao solicitacao) {
    // solicitacaoService.update(solicitacao);
    // return ResponseEntity.ok().build();
    // }
}
