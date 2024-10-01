package com.acme.solicitacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contratacao {

    private long id;
    private long idMusico;
    private String nomeMusico;
    private double salario;
    private String tipoContrato;
    private long idInstrumento;
    private String nomeInstrumento;
}
