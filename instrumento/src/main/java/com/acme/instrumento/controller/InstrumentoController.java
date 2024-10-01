package com.acme.instrumento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.instrumento.model.Instrumento;
import com.acme.instrumento.service.InstrumentoService;

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
public class InstrumentoController {

    private final InstrumentoService instrumentoService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(instrumentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Instrumento> optInstrumento = instrumentoService.findById(id);
        if (optInstrumento.isPresent()) {
            return ResponseEntity.ok(optInstrumento.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        instrumentoService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Instrumento instrumento) {
        Instrumento created = instrumentoService.create(instrumento);
        return ResponseEntity.ok(created);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Instrumento instrumento) {
        instrumentoService.update(instrumento);
        return ResponseEntity.ok().build();
    }
}
