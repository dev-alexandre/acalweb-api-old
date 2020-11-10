package br.com.acalapi.entity.caixa;

import br.com.acalapi.entity.AE;
import lombok.Data;
import org.springframework.data.convert.Jsr310Converters;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Entrada extends AE {

    private LocalDate dataVencimento;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataPagamento;

    private String motivo;
    private String responsavel;
    private BigDecimal valor;

}