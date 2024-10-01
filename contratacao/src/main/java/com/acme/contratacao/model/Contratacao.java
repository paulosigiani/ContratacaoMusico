package com.acme.contratacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Contratacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "musico_id")
    private long idMusico;
    @Column(name = "nome_musico")
    private String nomeMusico;
    private double salario;
    @Column(name = "tipo_contrato")
    private String tipoContrato;
    @Column(name = "instrumento_id")
    private long idInstrumento;
    @Column(name = "nome_instrumento")
    private String nomeInstrumento;
}
