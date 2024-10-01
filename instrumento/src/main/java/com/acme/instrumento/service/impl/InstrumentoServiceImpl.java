package com.acme.instrumento.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acme.instrumento.model.Instrumento;
import com.acme.instrumento.repository.InstrumentoRepository;
import com.acme.instrumento.service.InstrumentoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstrumentoServiceImpl implements InstrumentoService {

    private final InstrumentoRepository instrumentoRepository;

    @Override
    public Instrumento create(Instrumento instrumento) {
        return instrumentoRepository.save(instrumento);
    }

    @Override
    public Optional<Instrumento> findById(Long id) {
        return instrumentoRepository.findById(id);
    }

    @Override
    public List<Instrumento> findAll() {
        return instrumentoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        instrumentoRepository.deleteById(id);
    }

    @Override
    public Instrumento update(Instrumento instrumento) {
        return instrumentoRepository.save(instrumento);
    }

}
