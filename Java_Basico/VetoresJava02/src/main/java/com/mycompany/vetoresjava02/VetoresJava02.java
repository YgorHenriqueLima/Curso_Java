package com.mycompany.vetoresjava02;

import java.util.Scanner;

public class VetoresJava02 {
    public static void main(String[] args) {
       String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
       int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
       int ano_atual;
        
        
       for (int c = 0; c<mes.length; c++){
            System.out.println("o mês de "+ mes[c] + " tem " + tot[c] + "dias ao todo");
       }
      
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("qual seu ano atual?: ");
       ano_atual = entrada.nextInt();
       
       if (ano_atual % 4 == 0 && ano_atual % 100 != 0 || ano_atual % 400 == 0){
           System.out.println("ano bissexto");
           tot[1]++;
           System.out.printf("No ano de %d acrescenta-se 1 dia a mais no mês de fevereiro" + 
           "ficando assim: %s: %d\n", ano_atual, mes[1], tot[1]);
       }else{
           System.out.println("nao é bissexto");
       }
        
    }
}
