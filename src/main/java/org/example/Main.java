package org.example;

public class Main {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad de Cundinamarca");

        Curso curso1 = new Curso("Ingeniería de Software");

        Estudiante e1 = new Estudiante("Juanito", 26, "masculino");
        Estudiante e2 = new Estudiante("Maria", 23, "femenino");

        // asociación
        e1.inscribirse(curso1);
        e2.inscribirse(curso1);

        // composición
        uni.agregarCurso(curso1);

        curso1.mostrarEstudiantes();
    }
}
