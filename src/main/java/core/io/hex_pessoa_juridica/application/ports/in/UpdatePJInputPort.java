package core.io.hex_pessoa_juridica.application.ports.in;

import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;

public interface UpdatePJInputPort {
    PessoaJuridica update(Long id, PessoaJuridica pessoaJuridica);
}
