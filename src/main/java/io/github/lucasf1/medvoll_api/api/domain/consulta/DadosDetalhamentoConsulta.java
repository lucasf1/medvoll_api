package io.github.lucasf1.medvoll_api.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(
    Long id,
    Long idMedico,
    Long idPaciente,
    LocalDateTime data
) {

}
