package core.io.hex_pessoa_juridica.adapter.out.repository.mapper;

import core.io.hex_pessoa_juridica.adapter.out.repository.entity.DadosFinanceirosEntity;
import core.io.hex_pessoa_juridica.application.core.domain.DadosFinanceiros;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadosFinanceirosMapper {

    DadosFinanceiros toDadosFinanceiros(DadosFinanceirosEntity dadosFinanceirosEntity);

    DadosFinanceirosEntity toDadosFinanceirosEntity(DadosFinanceiros dadosFinanceiros);
}
