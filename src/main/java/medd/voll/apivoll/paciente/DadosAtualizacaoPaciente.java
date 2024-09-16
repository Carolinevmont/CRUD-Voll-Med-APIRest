package medd.voll.apivoll.paciente;

import jakarta.validation.constraints.NotNull;
import medd.voll.apivoll.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}