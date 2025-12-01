package core.io.hex_pessoa_juridica.application.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosFinanceiros {

    private Long idDadosFinanceiros;
    private BigDecimal faturamentoMensal;
    private LocalDate dataFundacao;
    private Long scoreCredito;
    private String setorAtividade;
}
