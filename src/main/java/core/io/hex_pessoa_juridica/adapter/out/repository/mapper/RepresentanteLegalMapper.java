package core.io.hex_pessoa_juridica.adapter.out.repository.mapper;

import core.io.hex_pessoa_juridica.adapter.out.repository.entity.RepresentanteLegalEntity;
import core.io.hex_pessoa_juridica.application.core.domain.RepresentanteLegal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RepresentanteLegalMapper {

    RepresentanteLegal toRepresentanteLegal(RepresentanteLegalEntity representanteLegalEntity);

    RepresentanteLegalEntity toRepresentanteLegalEntity(RepresentanteLegal representanteLegal);
}
