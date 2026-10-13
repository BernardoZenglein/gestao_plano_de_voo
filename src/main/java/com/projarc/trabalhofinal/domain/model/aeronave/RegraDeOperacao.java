package com.projarc.trabalhofinal.domain.model.aeronave;

import java.time.LocalDateTime;

public interface RegraDeOperacao {

    Boolean permite(Integer altitude, LocalDateTime entrada, LocalDateTime saida);
}
