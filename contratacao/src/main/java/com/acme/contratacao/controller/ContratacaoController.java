package com.acme.contratacao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.contratacao.model.Contratacao;
import com.acme.contratacao.service.ContratacaoService;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ContratacaoController {

    private final ContratacaoService contratacaoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(contratacaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Contratacao> optContratacao = contratacaoService.findById(id);
        if (optContratacao.isPresent()) {
            return ResponseEntity.ok(optContratacao.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        contratacaoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Contratacao contratacao) {
        Contratacao created = contratacaoService.create(contratacao);
        return ResponseEntity.ok(created);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Contratacao contratacao) {
        contratacaoService.update(contratacao);
        return ResponseEntity.ok().build();
    }
}
