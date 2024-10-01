package com.acme.instrumento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acme.instrumento.model.Instrumento;

@Service
public interface InstrumentoService {

    Instrumento create(Instrumento instrumento);

    Optional<Instrumento> findById(Long id);

    List<Instrumento> findAll();

    void deleteById(Long id);

    Instrumento update(Instrumento instrumento);
}
