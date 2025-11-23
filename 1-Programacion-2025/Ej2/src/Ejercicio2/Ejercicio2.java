package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int x, y, min, max;
        System.out.println("Dame un  numero x");
        x = entrada.nextInt();
        System.out.println("Dame un  numero y");
        y = entrada.nextInt();
        if (x>y){
            max=x;
            min=y;
        } else{
            max=y;
            min=x;
        }
        for( int cont=min; cont<=max; cont++){
            System.out.print(cont+ "");
        }

    }
}
