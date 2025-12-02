package core.io.hex_pessoa_juridica.application.ports.out;

import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;

import java.util.Optional;

public interface FindPJOutputPort {
    Optional<PessoaJuridica> findById(Long id);
}
