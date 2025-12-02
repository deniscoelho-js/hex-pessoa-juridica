package core.io.hex_pessoa_juridica.adapter.out;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.adapter.out.repository.PessoaJuridicaRepository;
import core.io.hex_pessoa_juridica.adapter.out.repository.entity.PessoaJuridicaEntity;
import core.io.hex_pessoa_juridica.adapter.out.repository.mapper.PessoaJuridicaMapper;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.out.FindAllPjOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllAdapter implements FindAllPjOutputPort {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private EnderecoClient enderecoClient;

    @Autowired
    private PessoaJuridicaMapper pessoaJuridicaMapper;

    @Override
    public List<PessoaJuridica> findAll() {
        return pessoaJuridicaRepository.findAll().stream()
                .map(pessoaJuridicaMapper::toPessoaJuridica)
                .collect(Collectors.toList());
    }
}
