package br.com.fiap.inicializador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("br.com.fiap.controllers")
public class inicializador {

	public static void main(String[] args) {
		SpringApplication.run(inicializador.class, args);
	}

}
