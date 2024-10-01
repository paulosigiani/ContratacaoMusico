package com.acme.contratacao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Musico {

    private Long id;
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;
    private String cep;

}
