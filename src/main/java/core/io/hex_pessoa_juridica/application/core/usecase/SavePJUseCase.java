package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.SavePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.SavePJOutputPort;

public class SavePJUseCase implements SavePJInputPort {

    private final SavePJOutputPort savePJOutputPort;

    private final EnderecoClient enderecoClient;

    public SavePJUseCase(SavePJOutputPort savePJOutputPort, EnderecoClient enderecoClient) {
        this.savePJOutputPort = savePJOutputPort;
        this.enderecoClient = enderecoClient;
    }


    @Override
    public PessoaJuridica save(PessoaJuridica pessoaJuridica) {
        var endereco = enderecoClient.getEndereco(pessoaJuridica.getCep());
        pessoaJuridica.setEndereco(endereco);
        var pessoaJuridicaSalva = savePJOutputPort.save(pessoaJuridica);
        pessoaJuridicaSalva.setEndereco(endereco);

        return pessoaJuridicaSalva;
    }
}
