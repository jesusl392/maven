package org.example;

import java.util.ArrayList;

public class Universidad {

    private String nombre;
    private ArrayList<Curso> cursos;

    public Universidad() {
        cursos = new ArrayList<>();
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public String getNombre() {
        return nombre;
    }
}
