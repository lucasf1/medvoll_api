package io.github.lucasf1.medvoll_api.api.domain.medico;

import io.github.lucasf1.medvoll_api.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    @NotNull
    Long id,

    String nome, 
    
    String telefone,
    
    DadosEndereco dadosEndereco
) {

}
