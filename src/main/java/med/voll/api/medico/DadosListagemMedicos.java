package med.voll.api.medico;

import med.voll.api.Medico;

public record DadosListagemMedicos(
        String nome,
        String email,
        String crm,
        Especialidade essEspecialidade) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
