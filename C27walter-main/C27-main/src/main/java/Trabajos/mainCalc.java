package Trabajos;

import java.util.Scanner;

public class mainCalc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("ingrese el numero 1");
        int num1=scanner.nextInt();
        System.out.println("ingrese el numero 2");
        int num2=scanner.nextInt();
        Calculadora calculadora1=new Calculadora();
        System.out.println("que operacion desea realizar: 1 suma, 2 resta, 3 multiplicacion, 4 division");
        int numOpcion=scanner.nextInt();
        switch(numOpcion){
            case 1:
                System.out.println("el resultado es "+ calculadora1.suma(num1, num2));
                break;
            case 2:
                System.out.println("el resultado es "+ calculadora1.resta(num1, num2));
                break;
            case 3:
                System.out.println("el resultado es "+ calculadora1.multiplicacion(num1, num2));
                break;
            case 4:
                // si la division por cero la realizo con valores de tipo double no me muestra
                //error aritmetico, me muestra resultado infinity
              // System.out.println("el resultado es "+ calculadora1.division(num1, num2));
               // break;
                try {
                    double res= calculadora1.division(num1, num2);
                    System.out.println("el resultado es"+ res);
                }catch (ArithmeticException e){
                    System.out.println("la division por cero no esta permitida");
                }
                break;
            default:
                System.out.println("la opcion ingresada no es valida");

        }
    }
}
