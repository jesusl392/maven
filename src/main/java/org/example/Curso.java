package org.example;

import java.util.ArrayList;

public class Curso {

    private String nombreCurso;
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        estudiantes = new ArrayList<>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Curso: " + nombreCurso);
        for (Estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
    }
}
