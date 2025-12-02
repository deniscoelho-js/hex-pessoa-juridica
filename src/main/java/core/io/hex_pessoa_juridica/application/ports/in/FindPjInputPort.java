package core.io.hex_pessoa_juridica.application.ports.in;

import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;

import java.util.Optional;

public interface FindPjInputPort {
    PessoaJuridica findById(Long id);
}
