package Clase3;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("digite su edad ");

        int edad=scanner.nextInt();

        if (edad>=18){
            System.out.println("ya es mayor de edad");
        }else{
            System.out.println("aun no es mayor de edad");
        }
        System.out.println("digite un dia de la semana");
        int dia=scanner.nextInt();

        String nombreDelDia =switch (dia){
            case 1  -> "lunes";
            case 2  -> "martes";
            case 3  -> "miercoles";
            default -> "dia no valido";
        };
        System.out.println("el dia de la semana es"+nombreDelDia);
        scanner.close();
    }
}
