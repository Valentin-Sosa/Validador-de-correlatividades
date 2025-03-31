package domain.universidad;

import java.util.Set;

public class Materia {
    private Set<Materia> correlativas;

    public Materia(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean chequearCorrelativas(Alumno alumno)
    {
        return this.correlativas
                .stream()
                .allMatch(correlativa -> alumno.estaAprobada(correlativa));
    }
}
