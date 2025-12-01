package core.io.hex_pessoa_juridica.adapter.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RepresentanteLegalResponse {
    private String nome;
    private String cpf;
    private String cargo;
    private String email;
    private String telefone;
}
