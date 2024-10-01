package com.acme.contratacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ContratacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContratacaoApplication.class, args);
	}

}
