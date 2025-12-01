package core.io.hex_pessoa_juridica.adapter.out.client;

import core.io.hex_pessoa_juridica.application.core.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "viaCepApi")
public interface EnderecoClient {
    @GetMapping("/{cep}/json")
    Endereco getEndereco(@PathVariable("cep") String cep);
}

