package com.acme.solicitacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Solicitacao {

    private Musico musico;
    private double salario;
    private String tipoContrato;
    private Instrumento instrumento;
}
