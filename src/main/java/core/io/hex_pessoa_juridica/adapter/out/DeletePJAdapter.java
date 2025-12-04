package core.io.hex_pessoa_juridica.adapter.out;

import core.io.hex_pessoa_juridica.adapter.out.repository.PessoaJuridicaRepository;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.DeletePJOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletePJAdapter implements DeletePJOutputPort {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Override
    public void delete(Long id) {
        pessoaJuridicaRepository.deleteById(id);
    }
}
