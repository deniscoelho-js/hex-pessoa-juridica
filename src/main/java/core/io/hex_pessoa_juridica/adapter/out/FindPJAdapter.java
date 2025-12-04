package core.io.hex_pessoa_juridica.adapter.out;

import core.io.hex_pessoa_juridica.adapter.out.repository.PessoaJuridicaRepository;
import core.io.hex_pessoa_juridica.adapter.out.repository.mapper.PessoaJuridicaMapper;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.out.FindPJOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindPJAdapter implements FindPJOutputPort {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private PessoaJuridicaMapper pessoaJuridicaMapper;

    @Override
    public Optional<PessoaJuridica> findById(Long id) {
        var pjEntity = pessoaJuridicaRepository.findById(id);
        return pjEntity.map(entity -> pessoaJuridicaMapper.toPessoaJuridica(entity));
    }
}
