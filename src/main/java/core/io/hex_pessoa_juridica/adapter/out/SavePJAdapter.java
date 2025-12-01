package core.io.hex_pessoa_juridica.adapter.out;

import core.io.hex_pessoa_juridica.adapter.out.repository.PessoaJuridicaRepository;
import core.io.hex_pessoa_juridica.adapter.out.repository.entity.PessoaJuridicaEntity;
import core.io.hex_pessoa_juridica.adapter.out.repository.mapper.PessoaJuridicaMapper;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.out.SavePJOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavePJAdapter implements SavePJOutputPort {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private PessoaJuridicaMapper pessoaJuridicaMapper;

    @Override
    public PessoaJuridica save(PessoaJuridica pessoaJuridica) {
        var entity = pessoaJuridicaMapper.toPessoaJuridicaEntity(pessoaJuridica);
        var pjSalvo = pessoaJuridicaRepository.save(entity);

        return pessoaJuridicaMapper.toPessoaJuridica(pjSalvo);
    }
}
