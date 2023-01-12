package io.github.lucasf1.medvoll_api.api.medico;

import io.github.lucasf1.medvoll_api.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
    String nome,
    String email,
    String crm,
    Especialidade especialidade,
    DadosEndereco endereco
) {

}
