package io.github.lucasf1.medvoll_api.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
    @NotNull
    Long idConsulta,

    @NotNull
    MotivoCancelamento motivo
) {

}
