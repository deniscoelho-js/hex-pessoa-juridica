package core.io.hex_pessoa_juridica.adapter.out;

import core.io.hex_pessoa_juridica.adapter.out.repository.PessoaJuridicaRepository;
import core.io.hex_pessoa_juridica.adapter.out.repository.mapper.PessoaJuridicaMapper;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.UpdatePJOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePJAdapter implements UpdatePJOutputPort {

    @Autowired
    private FindPJInputPort findPJInputPort;

    @Autowired
    private PessoaJuridicaMapper pessoaJuridicaMapper;

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Override
    public PessoaJuridica update(Long id, PessoaJuridica pessoaJuridica) {
        var pjEntity = pessoaJuridicaMapper.toPessoaJuridicaEntity(pessoaJuridica);
        pjEntity.setIdPessoaJuridica(id);
        var pjSalvo = pessoaJuridicaRepository.save(pjEntity);
        return pessoaJuridicaMapper.toPessoaJuridica(pjSalvo);
    }
}
