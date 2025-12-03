package core.io.hex_pessoa_juridica.application.ports.out;

import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;

import java.util.List;

public interface FindAllPjOutputPort {
    List<PessoaJuridica> findAll();
}
