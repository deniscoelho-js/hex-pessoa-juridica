package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindPJOutputPort;

public class FindPJUseCase implements FindPJInputPort {

    private final FindPJOutputPort findPJOutputPort;

    private final EnderecoClient enderecoClient;

    public FindPJUseCase(FindPJOutputPort findPJOutputPort, EnderecoClient enderecoClient) {
        this.findPJOutputPort = findPJOutputPort;
        this.enderecoClient = enderecoClient;
    }

    @Override
    public PessoaJuridica findById(Long id) {
        var pessoaJuridica = findPJOutputPort.findById(id)
                .orElseThrow(() -> new RuntimeException("PJ não encontrado"));
        var endereco = enderecoClient.getEndereco(pessoaJuridica.getCep());
        pessoaJuridica.setEndereco(endereco);
        return pessoaJuridica;
    }
}
