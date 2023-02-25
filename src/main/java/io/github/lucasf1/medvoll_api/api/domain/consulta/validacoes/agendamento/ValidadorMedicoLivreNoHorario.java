package io.github.lucasf1.medvoll_api.api.domain.consulta.validacoes.agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.lucasf1.medvoll_api.api.domain.ValidacaoException;
import io.github.lucasf1.medvoll_api.api.domain.consulta.ConsultaRepository;
import io.github.lucasf1.medvoll_api.api.domain.consulta.DadosAgendamentoConsulta;

@Component
public class ValidadorMedicoLivreNoHorario implements ValidadorAgendamentoConsulta {

    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar(DadosAgendamentoConsulta dados) {

        var medicoOcupadoNoHorario = consultaRepository
                .existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(dados.idMedico(), dados.data());
        if (medicoOcupadoNoHorario) {
            throw new ValidacaoException(
                    "Médico já possui outra consulta agendade nesse horário");
        }
    }
}
