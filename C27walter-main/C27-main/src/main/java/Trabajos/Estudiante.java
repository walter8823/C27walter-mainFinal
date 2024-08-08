package Trabajos;
import java.util.Scanner;
public class Estudiante {


    
    String nombre;
    String apellido;
    int edad;
    double nota;

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre=nombre;
       // this.apellido=apellido;
        this.edad=edad;
        this.nota=nota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudiante[] estudiante= new Estudiante[3];
        Double SumaNotas =0.0;
        for (int i = 0; i<3; i++){

            System.out.println("ingrese el nombre y apellido del estudiante "+(i+1));
            String nombre= scanner.nextLine();

            System.out.println("ingrese la edad del estudiante "+(i+1));
            int edad =scanner.nextInt();

            System.out.println("ingrese la nota del estudiante"+(i+1));
            double nota=scanner.nextDouble();
            scanner.nextLine();

            SumaNotas+=nota;
            estudiante[i]= new Estudiante(nombre, edad, nota);

        }

        Double promNotas  =SumaNotas/3;

        System.out.println("el promedio de las notas de los 3 estudiantes es:"+promNotas);

    }
}
