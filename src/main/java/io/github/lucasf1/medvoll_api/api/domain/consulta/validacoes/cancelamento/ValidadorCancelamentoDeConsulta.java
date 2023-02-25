package io.github.lucasf1.medvoll_api.api.domain.consulta.validacoes.cancelamento;

import io.github.lucasf1.medvoll_api.api.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}