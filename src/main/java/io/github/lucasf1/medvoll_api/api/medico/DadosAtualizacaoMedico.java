package io.github.lucasf1.medvoll_api.api.medico;

import io.github.lucasf1.medvoll_api.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    @NotNull
    Long id,

    String nome, 
    
    String telefone,
    
    DadosEndereco dadosEndereco
) {

}
