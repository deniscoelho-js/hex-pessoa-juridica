package core.io.hex_pessoa_juridica.application.ports.out;

import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;

public interface UpdatePJOutputPort {
    PessoaJuridica update(Long id, PessoaJuridica pessoaJuridica);
}
