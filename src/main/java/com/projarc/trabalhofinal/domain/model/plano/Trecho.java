package com.projarc.trabalhofinal.domain.model.plano;

import com.projarc.trabalhofinal.domain.model.malha.Aerovia;

import java.time.LocalDateTime;

public class Trecho {

    private Aerovia aerovia;
    private Integer altitude;
    private LocalDateTime horarioEntradaNaAerovia;
    private AcaoNaChegada acaoNaChegada;
    private Integer numeroVagaPretendida;
    private Integer tempoPermanenciaMinutos;

    public LocalDateTime calcularChegada(Integer velocidadeKmH) {
        throw new UnsupportedOperationException("TODO");
    }
}
