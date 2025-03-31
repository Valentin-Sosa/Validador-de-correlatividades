package domain.universidad;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasDeseadas;
    private Alumno alumno;

    public Inscripcion(Set<Materia> materiasDeseadas, Alumno alumno) {
        this.materiasDeseadas = materiasDeseadas;
        this.alumno = alumno;
    }

    public boolean aprobada()
    {
        return this.materiasDeseadas.stream().allMatch(materia -> materia.chequearCorrelativas(this.alumno));
    }
}
