package core.io.hex_pessoa_juridica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "core.io.hex_pessoa_juridica.adapter.out.client")
public class HexPessoaJuridicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexPessoaJuridicaApplication.class, args);
	}

}
