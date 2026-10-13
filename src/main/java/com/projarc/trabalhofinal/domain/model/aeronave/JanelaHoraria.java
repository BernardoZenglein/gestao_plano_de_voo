package com.projarc.trabalhofinal.domain.model.aeronave;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class JanelaHoraria implements RegraDeOperacao {

    private LocalTime inicio;
    private LocalTime fim;

    @Override
    public Boolean permite(Integer altitude, LocalDateTime entrada, LocalDateTime saida) {
        throw new UnsupportedOperationException("TODO");
    }
}
