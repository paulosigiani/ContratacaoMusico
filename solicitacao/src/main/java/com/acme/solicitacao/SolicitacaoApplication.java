package com.acme.solicitacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SolicitacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoApplication.class, args);
	}

}
