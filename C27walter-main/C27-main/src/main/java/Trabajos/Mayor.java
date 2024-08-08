package Trabajos;
import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos numeros desea comparar para hallar el mayor");
        int j =scanner.nextInt();
        int[] numeros = new int[j];
        int mayor = 0;
        for (int i =0; i<j;i++){
            System.out.println("ingrese el "+(i+1)+ "numero");
            int numero =scanner.nextInt();
            numeros[i]=numero;

        }
        mayor=numeros[0];
        for (int i =0; i<j;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }

        }
        System.out.println("de los numeros ingresados el mayor es: "+mayor);

    }
}
