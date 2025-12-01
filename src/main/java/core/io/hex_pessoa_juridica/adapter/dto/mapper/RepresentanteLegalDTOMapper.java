package core.io.hex_pessoa_juridica.adapter.dto.mapper;

import core.io.hex_pessoa_juridica.adapter.dto.response.RepresentanteLegalResponse;
import core.io.hex_pessoa_juridica.application.core.domain.RepresentanteLegal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RepresentanteLegalDTOMapper {

    RepresentanteLegalResponse toRepresentanteLegalResponse(RepresentanteLegal representanteLegal);
}
