package br.com.acalapi.entity.caixa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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