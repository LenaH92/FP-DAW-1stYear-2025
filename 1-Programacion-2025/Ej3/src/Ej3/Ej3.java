package Ej3;

import java.util.Scanner;

public class Ej3{
    public static void main(String [] args){
        Scanner entrada  = new Scanner(System.in);
        int x, cont, value;
        System.out.println("Dame un número x");
        x = entrada.nextInt();
        for(cont=0;cont<=10;cont++){
            value = x*cont;
            System.out.print(cont+ " * " + x +" = " + value);
        }
    }
}
