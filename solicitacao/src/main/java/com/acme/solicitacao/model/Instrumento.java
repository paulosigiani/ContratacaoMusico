package com.acme.solicitacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Instrumento {

    private Long id;
    private String nome;
    private int codigo;
    private String tipoInstrumento;
}
