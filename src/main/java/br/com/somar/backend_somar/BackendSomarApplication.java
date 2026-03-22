package br.com.somar.backend_somar;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BackendSomarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendSomarApplication.class, args);
	}

	 	@PostConstruct
	public void init() {
		try {
			// Aguarda 15 segundos antes de inicializar conexões
				
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("====================================");
		System.out.println("==============INICIADO==============");
		System.out.println("====================================");
	}
}
