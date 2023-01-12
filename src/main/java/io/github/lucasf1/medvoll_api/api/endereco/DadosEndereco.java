package io.github.lucasf1.medvoll_api.api.endereco;

public record DadosEndereco(
    String logradouro,
    String bairro,
    String cep,
    String cidade,
    String uf,
    String complemento,
    String numero
) {

}
