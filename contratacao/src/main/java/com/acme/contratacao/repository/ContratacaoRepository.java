package com.acme.contratacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.contratacao.model.Contratacao;

public interface ContratacaoRepository extends JpaRepository<Contratacao, Long> {

}