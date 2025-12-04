package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.FindAllPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindAllPJOutputPort;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllPJUseCase implements FindAllPJInputPort {

    private final EnderecoClient enderecoClient;

    private final FindAllPJOutputPort findAllPjOutputPort;

    public FindAllPJUseCase(EnderecoClient enderecoClient, FindAllPJOutputPort findAllPjOutputPort) {
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
