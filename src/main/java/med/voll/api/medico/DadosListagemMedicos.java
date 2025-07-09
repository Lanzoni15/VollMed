package med.voll.api.medico;

import med.voll.api.Medico;

public record DadosListagemMedicos(
        String nome,
        Long id,
        String email,
        String crm,
        Especialidade essEspecialidade) {

    public DadosListagemMedicos(Medico medico) {
        this(medico.getNome(), medico.getId(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
