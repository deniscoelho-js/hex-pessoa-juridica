package core.io.hex_pessoa_juridica.adapter.dto.mapper;

import core.io.hex_pessoa_juridica.adapter.dto.request.PessoaJuridicaRequest;
import core.io.hex_pessoa_juridica.adapter.dto.response.PessoaJuridicaResponse;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaJuridicaDTOMapper {

    PessoaJuridica toPessoaJuridica(PessoaJuridicaRequest pessoaJuridicaRequest);

    PessoaJuridicaResponse toPessoaJuridicaResponse(PessoaJuridica pessoaJuridica);
}
