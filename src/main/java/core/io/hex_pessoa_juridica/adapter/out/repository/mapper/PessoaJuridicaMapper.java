package core.io.hex_pessoa_juridica.adapter.out.repository.mapper;

import core.io.hex_pessoa_juridica.adapter.out.repository.entity.PessoaJuridicaEntity;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {RepresentanteLegalMapper.class, DadosFinanceirosMapper.class})
public interface PessoaJuridicaMapper {

    @Mapping(source = "representanteLegalEntity", target = "representanteLegal")
    @Mapping(source = "dadosFinanceirosEntity", target = "dadosFinanceiros")
    PessoaJuridica toPessoaJuridica(PessoaJuridicaEntity pessoaJuridicaEntity);

    @Mapping(source = "representanteLegal", target = "representanteLegalEntity")
    @Mapping(source = "dadosFinanceiros", target = "dadosFinanceirosEntity")
    PessoaJuridicaEntity toPessoaJuridicaEntity(PessoaJuridica pessoaJuridica);
}
