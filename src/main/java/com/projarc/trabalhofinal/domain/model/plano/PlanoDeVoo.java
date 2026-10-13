package com.projarc.trabalhofinal.domain.model.plano;

import com.projarc.trabalhofinal.domain.model.aeronave.Aeronave;
import com.projarc.trabalhofinal.domain.model.malha.Aeroporto;
import com.projarc.trabalhofinal.domain.model.reserva.Reserva;

import java.time.LocalDateTime;
import java.util.List;

public class PlanoDeVoo {

    private Integer id;
    private Status status;
    private LocalDateTime dataHoraPartida;
    private Aeronave aeronave;
    private Piloto piloto;
    private Aeroporto origem;
    private Aeroporto destino;
    private Percurso percurso;
    private List<Reserva> reservas;

    public void aprovar() {
        throw new UnsupportedOperationException("TODO");
    }

    public void cancelar(LocalDateTime agora) {
        throw new UnsupportedOperationException("TODO");
    }

    public void abandonar() {
        throw new UnsupportedOperationException("TODO");
    }
}
