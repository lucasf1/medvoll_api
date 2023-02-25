package io.github.lucasf1.medvoll_api.api.domain.consulta.validacoes.agendamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.lucasf1.medvoll_api.api.domain.ValidacaoException;
import io.github.lucasf1.medvoll_api.api.domain.consulta.DadosAgendamentoConsulta;
import io.github.lucasf1.medvoll_api.api.domain.paciente.PacienteRepository;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoConsulta {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void validar(DadosAgendamentoConsulta dados) {

        var pacienteEstaAtivo = pacienteRepository.findAtivoById(dados.idPaciente());
        if (! pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada para paciente inativo");
        }
    }
}
