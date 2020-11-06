package br.com.acalapi.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Contrato extends AE{

    private Cliente cliente;
    private Matricula matricula;
    private Matricula matriculaCorrespondencia;
    private Grupo grupo;
    private Boolean indContratoPrincipal;
    private BigDecimal valor;

    private boolean habilitado;

}