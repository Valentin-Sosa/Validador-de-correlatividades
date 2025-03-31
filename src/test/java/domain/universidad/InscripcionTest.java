package domain.universidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia algebra = new Materia(new HashSet<>());
    Materia analisis1 = new Materia(new HashSet<>());
    Materia analisis2 = new Materia(Set.of(algebra, analisis1));

    @Test
    @DisplayName("La inscripcion de un alumno que no tiene las correlativas es rechazada")
    public void verificaInscripcionInvalida()
    {
        Alumno alumno = new Alumno("Tony", "Soprano", Set.of(algebra));
        Inscripcion nuevaInscripcion = new Inscripcion(Set.of(analisis2),alumno);

        Assertions.assertFalse(nuevaInscripcion.aprobada());
    }

    @Test
    @DisplayName("La inscripcion de un alumno que tiene las correlativas es aprobada")
    public void verificiarInscripcionValida()
    {
        Alumno alumno = new Alumno("Walter", "White", Set.of(algebra, analisis1));
        Inscripcion nuevaInscripcion = new Inscripcion(Set.of(analisis2),alumno);

        Assertions.assertTrue(nuevaInscripcion.aprobada());
    }






}