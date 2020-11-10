package br.com.acalapi.entity;

import br.com.acalapi.entity.caixa.Entrada;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Boleto extends AE {

    private String numero;
    private Contrato contrato;
    private Referencia referencia;
    private List<Entrada> valores;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate dataNascimento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate dataPagamento;

}