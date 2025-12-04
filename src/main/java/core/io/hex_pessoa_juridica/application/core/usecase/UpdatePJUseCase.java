package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.UpdatePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.UpdatePJOutputPort;

public class UpdatePJUseCase implements UpdatePJInputPort {

    private final FindPJInputPort findPJInputPort;

    private final UpdatePJOutputPort updatePJOutputPort;

    private final EnderecoClient enderecoClient;

    public UpdatePJUseCase(FindPJInputPort findPJInputPort, UpdatePJOutputPort updatePJOutputPort, EnderecoClient enderecoClient) {
        this.findPJInputPort = findPJInputPort;
        this.updatePJOutputPort = updatePJOutputPort;
        this.enderecoClient = enderecoClient;
    }

    @Override
    public PessoaJuridica update(Long id, PessoaJuridica pessoaJuridica) {
        findPJInputPort.findById(id);
        var endereco = enderecoClient.getEndereco(pessoaJuridica.getCep());
        pessoaJuridica.setEndereco(endereco);
        var pjAtualizado = updatePJOutputPort.update(id, pessoaJuridica);
        pjAtualizado.setEndereco(endereco);
        return pjAtualizado;
    }
}
