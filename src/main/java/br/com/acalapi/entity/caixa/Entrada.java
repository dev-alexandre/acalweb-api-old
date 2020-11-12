package br.com.acalapi.entity.caixa;

import br.com.acalapi.entity.AE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.convert.Jsr310Converters;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Entrada extends AE {

    private LocalDate dataVencimento;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataPagamento;

    private String motivo;
    private String responsavel;
    private BigDecimal valor;

}