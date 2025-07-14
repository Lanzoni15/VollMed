package med.voll.api.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import med.voll.api.Pacientes;

public interface PacienteRepository extends JpaRepository<Pacientes, Long> {

    Page<Pacientes> findAllByAtivosTrue(Pageable paginacao);
}
