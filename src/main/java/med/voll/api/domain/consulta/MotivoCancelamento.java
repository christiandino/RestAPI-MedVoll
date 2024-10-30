package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public enum MotivoCancelamento {

    PACIENTE_DESISTIU,
    MEDICO_CANCELOU,
    OUTROS;

}