package clase5;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la temperatura que desea convertir");
        double temperatura=scanner.nextDouble();
        System.out.println("medida de temperatura que ingreso: 1 farenheit, 2 celsius");
        int tempInt=scanner.nextInt();
        System.out.println("medida de temperatura en que desea convertirla: 1 farenheit, 2 celsius");
        int tempSal=scanner.nextInt();
        if (tempInt==1){
            temperatura =((temperatura-32)*0.555);
        }else{if (tempInt==2){
            temperatura=((temperatura*1.8)+32);
        }else{
            System.out.println("la opcion no es valida");
        }

        } System.out.println("la temperatura final es:"+temperatura);
    }

}
