package medd.voll.apivoll.medico;

import jakarta.validation.constraints.NotNull;
import medd.voll.apivoll.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,
        //Por não ser String utilizamos notnull pra um campo obrigatório
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
