package clase5;
import java.util.Scanner;

public class ManejoCadenas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese una cadena de texto");
        String cadena =scanner.nextLine();
        int longitud=cadena.length();
        String cadenaMayusc =cadena.toUpperCase();
        String cadenaMinusc =cadena.toLowerCase();
        boolean contieneJava = cadena.contains("java");
        if (contieneJava){
            System.out.println("la cadena contiene la palabra java");
        }else{
            System.out.println("la cadena no contiene la palabra ja");
        }
        System.out.println("la cadena en mayuscula es: "+cadenaMayusc);
        System.out.println("la cadena en minuscula es: "+cadenaMinusc);
        System.out.println("la longitud de la cadena es:"+longitud);
        System.out.println("la cadena original es: "+cadena);
    }
}
