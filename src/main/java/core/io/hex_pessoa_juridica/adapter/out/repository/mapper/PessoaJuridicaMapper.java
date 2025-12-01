package core.io.hex_pessoa_juridica.adapter.out.repository.mapper;

import core.io.hex_pessoa_juridica.adapter.out.repository.entity.PessoaJuridicaEntity;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaJuridicaMapper {

    PessoaJuridica toPessoaJuridica(PessoaJuridicaEntity pessoaJuridicaEntity);

    PessoaJuridicaEntity toPessoaJuridicaEntity(PessoaJuridica pessoaJuridica);
}
