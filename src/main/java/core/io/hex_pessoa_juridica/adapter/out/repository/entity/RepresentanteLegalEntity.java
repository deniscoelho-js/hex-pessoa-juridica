package core.io.hex_pessoa_juridica.adapter.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RepresentanteLegalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRepresentanteLegal;
    private String nome;
    private String cpf;
    private String cargo;
    private String email;
    private String telefone;
}
