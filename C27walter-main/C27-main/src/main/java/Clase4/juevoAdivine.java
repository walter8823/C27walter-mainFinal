package Clase4;
import java.util.Scanner;

public class juevoAdivine {
    public   static int number=0;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("intente adivinar el numero secreto");
        int numero=15;


        do {

            System.out.println(" ingrese el numero que cree sera la respuesta");
            int number=scanner.nextInt();
            if (number==numero){
                System.out.println("adivinaste, el numero es "+numero);
                break;
            }
        }while(number != numero );

    }
}
