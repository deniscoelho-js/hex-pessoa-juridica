package core.io.hex_pessoa_juridica.adapter.dto.mapper;

import core.io.hex_pessoa_juridica.adapter.dto.response.EnderecoResponse;
import core.io.hex_pessoa_juridica.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoDTOMapper {

    EnderecoResponse toEnderecoResponse(Endereco endereco);
}
