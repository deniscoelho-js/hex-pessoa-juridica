package core.io.hex_pessoa_juridica.adapter.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DadosFinanceirosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDadosFinanceiros;
    private BigDecimal faturamentoMensal;
    private LocalDate dataFundacao;
    private Long scoreCredito;
    private String setorAtividade;
}
