package Clase4;
import java.util.Scanner;

public class juegoNegativo {
    public static int numero=0;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int suma = 0;
        while (numero>=0){
            System.out.println("ingrese un numero");
            int numero=scanner.nextInt();



            if(numero<0){
                System.out.println("ingresaste un negativo");
                break;
            }else{
                suma += numero;
            }
        }
        System.out.println("el acumulado es: "+ suma);
    }
}
