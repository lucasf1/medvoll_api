package io.github.lucasf1.medvoll_api.api.domain.paciente;

import io.github.lucasf1.medvoll_api.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
    Long id,
    String nome,
    String telefone,
    @Valid DadosEndereco endereco
) {
}
