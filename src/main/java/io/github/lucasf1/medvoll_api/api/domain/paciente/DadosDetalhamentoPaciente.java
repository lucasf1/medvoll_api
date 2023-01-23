package io.github.lucasf1.medvoll_api.api.domain.paciente;

import io.github.lucasf1.medvoll_api.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(
        String nome,
        String email,
        String cpf,
        String telefone,
        Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(),
                paciente.getEndereco());
    }
}
