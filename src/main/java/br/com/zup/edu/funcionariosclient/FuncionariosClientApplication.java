package br.com.zup.edu.funcionariosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FuncionariosClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionariosClientApplication.class, args);
	}

}
