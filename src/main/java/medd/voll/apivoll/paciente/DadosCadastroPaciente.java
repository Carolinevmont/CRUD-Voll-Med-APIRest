package medd.voll.apivoll.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import medd.voll.apivoll.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,

        @NotBlank @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        String cpf,

        @NotNull @Valid
        DadosEndereco endereco) {
}
