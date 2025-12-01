package core.io.hex_pessoa_juridica.adapter.out.repository.entity;

import core.io.hex_pessoa_juridica.application.core.domain.DadosFinanceiros;
import core.io.hex_pessoa_juridica.application.core.domain.Endereco;
import core.io.hex_pessoa_juridica.application.core.domain.RepresentanteLegal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PessoaJuridicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoaJuridica;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String email;
    private String telefone;
    private String site;
    private String cep;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idRepresentanteLegal")
    private RepresentanteLegalEntity representanteLegalEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDadosFinanceiros")
    private DadosFinanceirosEntity dadosFinanceirosEntity;
}
