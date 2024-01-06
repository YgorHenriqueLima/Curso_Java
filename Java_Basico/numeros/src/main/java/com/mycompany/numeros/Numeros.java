package com.mycompany.numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n, s=0;
        Scanner teclado = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("quer continuar?[S/N]: ");
            resp = teclado.next();
        }while(resp.equals("S"));
        System.out.println("a soma de todos os valores é " + s);
    }
}
