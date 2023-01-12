package io.github.lucasf1.medvoll_api.api.paciente;

import io.github.lucasf1.medvoll_api.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco
) {
}
