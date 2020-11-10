package br.com.acalapi.entity.caixa;

import br.com.acalapi.entity.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Saida extends AE {

    private Cliente cliente;
    private Matricula matricula;
    private Matricula matriculaCorrespondencia;
    private Grupo grupo;
    private Boolean indContratoPrincipal;
    private BigDecimal valor;
    private boolean habilitado;

    private List<Referencia> referencias;

}