package io.github.lucasf1.medvoll_api.api.domain.consulta.validacoes.agendamento;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import io.github.lucasf1.medvoll_api.api.domain.ValidacaoException;
import io.github.lucasf1.medvoll_api.api.domain.consulta.DadosAgendamentoConsulta;

@Component("ValidadorHorarioAntecedenciaAgendamento")
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamentoConsulta dados) {

        var dataConsulta = dados.data();
        var horaAtual = LocalDateTime.now();
        var diferencaMinutos = Duration.between(horaAtual, dataConsulta).toMinutes();

        if (diferencaMinutos < 30) {
            throw new ValidacaoException(
                    "Consulta deve ser agendada com antecedência mínima de 30 minutos.");
        }
    }
}
