package com.projarc.trabalhofinal.domain.model.aeronave;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Aeronave {

    private String prefixo;
    private Integer velocidadeDeCruzeiro;
    private Integer autonomia;
    private List<RegraDeOperacao> regras;

    public Double distanciaMaximaSemReabastecimento() {
        throw new UnsupportedOperationException("TODO");
    }

    public Boolean podeOperar(Integer altitude, LocalDateTime entrada, LocalDateTime saida) {
        throw new UnsupportedOperationException("TODO");
    }
}
