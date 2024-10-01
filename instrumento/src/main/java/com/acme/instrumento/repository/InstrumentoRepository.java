package com.acme.instrumento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.instrumento.model.Instrumento;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Long> {

}