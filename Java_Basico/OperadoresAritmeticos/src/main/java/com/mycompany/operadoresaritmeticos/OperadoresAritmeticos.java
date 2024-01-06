package com.mycompany.operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1; int num2;
        System.out.println("digite o primeiro valor: ");
        num1 = entrada.nextInt();
        
        System.out.println("digite o segundo valor: ");
        num2 = entrada.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
    }
}
