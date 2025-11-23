package Ej4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String [] args){
        Scanner entrada  = new Scanner(System.in);
        float num;
        int pares=0, impares = 0, cont;

        for(cont = 1;cont<=15;cont++){
            System.out.println("Dame un  numero x");
            num = entrada.nextFloat();
            if (num%2==0){
                pares++;
                System.out.print(num+" es par.");
            } else{
                impares++;
                System.out.print(num+" es impar.");
            }
        }
        System.out.print("hay " +pares+" números pares  y "+impares+" números impares.");
    }
}

