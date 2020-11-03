package br.com.acalapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Boleto extends AE {

    private String numero;
    private Contrato contrato;
    private String documento;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private LocalDate dataNascimento;

}