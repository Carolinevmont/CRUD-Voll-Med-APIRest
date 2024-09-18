package medd.voll.apivoll.domain.paciente;

import jakarta.validation.constraints.NotNull;
import medd.voll.apivoll.domain.endereco.DadosEndereco;


public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,
        //Por não ser String utilizamos notnull pra um campo obrigatório

        String nome,

        String email,

        String telefone ,

        DadosEndereco endereco) {
}