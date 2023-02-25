package io.github.lucasf1.medvoll_api.api.domain.consulta.validacoes.agendamento;

import io.github.lucasf1.medvoll_api.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoConsulta {

    void validar(DadosAgendamentoConsulta dados);
}
