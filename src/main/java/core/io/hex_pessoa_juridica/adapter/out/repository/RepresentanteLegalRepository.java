package core.io.hex_pessoa_juridica.adapter.out.repository;

import core.io.hex_pessoa_juridica.adapter.out.repository.entity.RepresentanteLegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepresentanteLegalRepository extends JpaRepository<RepresentanteLegalEntity, Long> {
}
