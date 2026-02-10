import org.example.Persona;

public class Main {
    public static void main(String[] args) {
        //crear persona desde constructor vacio
        Persona p1 = new Persona();
        p1.setNombre("juanito");
        p1.setEdad(26);
        p1.setGenero("masculino");

        //segunda persona creada usando constructor con todos los parametros
        Persona p2 = new Persona("maria",23,"femenino");

        //mostrar persona
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}