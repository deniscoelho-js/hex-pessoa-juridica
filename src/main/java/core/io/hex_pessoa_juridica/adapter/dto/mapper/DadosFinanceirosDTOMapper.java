package core.io.hex_pessoa_juridica.adapter.dto.mapper;

import core.io.hex_pessoa_juridica.adapter.dto.response.DadosFinanceirosResponse;
import core.io.hex_pessoa_juridica.application.core.domain.DadosFinanceiros;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadosFinanceirosDTOMapper {

    DadosFinanceirosResponse toDadosFinanceirosResponse(DadosFinanceiros dadosFinanceiros);
}
