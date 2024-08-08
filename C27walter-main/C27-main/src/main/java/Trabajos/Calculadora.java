package Trabajos;

import  java.util.Scanner;

public class Calculadora {
    public int num1;
    public int num2;
    Scanner scanner = new Scanner(System.in);

    public int suma(int num1, int num2) {
        return num1 + num2;

    }

    public int resta(int num1, int num2) {
        return num1 - num2;

    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;

    }

    public int division(int num1, int num2) {

        return num1 / num2;
    }



}