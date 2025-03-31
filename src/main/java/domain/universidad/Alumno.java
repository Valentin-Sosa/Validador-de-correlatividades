package domain.universidad;

import java.util.Collections;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia ...materias)
    {
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public Alumno(String nombre, String apellido, Set<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean estaAprobada(Materia materia)
    {
        return materiasAprobadas.contains(materia);
    }
}
