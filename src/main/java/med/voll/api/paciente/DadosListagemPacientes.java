package med.voll.api.paciente;

import med.voll.api.Pacientes;
import med.voll.api.paciente.Sintomas;

public record DadosListagemPacientes(
        String nome,
        Long id,
        String email,
        String telefone,
        Sintomas sintoma) {

    public DadosListagemPacientes(Pacientes paciente) {
        this(paciente.getNome(), paciente.getId(), paciente.getEmail(), paciente.getTelefone(), paciente.getSintoma());
    }

}
