package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.FindAllPjInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindAllPjOutputPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllPjUseCase implements FindAllPjInputPort {

    private final EnderecoClient enderecoClient;

    private final FindAllPjOutputPort findAllPjOutputPort;

    public FindAllPjUseCase(EnderecoClient enderecoClient, FindAllPjOutputPort findAllPjOutputPort) {
        this.enderecoClient = enderecoClient;
        this.findAllPjOutputPort = findAllPjOutputPort;
    }

    @Override
    public List<PessoaJuridica> findAll() {
        return findAllPjOutputPort.findAll()
                .stream()
                .map(pj -> {
                    var endereco = enderecoClient.getEndereco(pj.getCep());
                    pj.setEndereco(endereco);
                    return pj;
                })
                .collect(Collectors.toList());
    }
}
