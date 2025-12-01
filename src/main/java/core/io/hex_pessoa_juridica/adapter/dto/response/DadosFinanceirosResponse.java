package core.io.hex_pessoa_juridica.adapter.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosFinanceirosResponse {
    private BigDecimal faturamentoMensal;
    private LocalDateTime dataFundacao;
    private Long scoreCredito;
    private String setorAtividade;
}
