package org.example;

public class Estudiante extends Persona {

    public Estudiante() {}

    public Estudiante(String nombre, int edad, String genero) {
        super(nombre, edad, genero);
    }

    // Asociación con Curso
    public void inscribirse(Curso curso) {
        curso.agregarEstudiante(this);
    }
}
