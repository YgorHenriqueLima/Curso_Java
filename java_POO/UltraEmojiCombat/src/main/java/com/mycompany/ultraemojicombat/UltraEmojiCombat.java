package com.mycompany.ultraemojicombat;

import java.util.Scanner;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int es1, es2;
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("PutsScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 0, 2);
        l[3] = new Lutador("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        System.out.println("### LUTADORES ###");
        System.out.println("0 - PrettyBoy\n1 - PutsScript\n2 - SnapShadow\n3 - DeadCode\n4 - UFOCobol\n5 - Nerdaart");
        System.out.println("Escolha um desafiado: ");
        es1 = ler.nextInt();
        System.out.println("Escolha um desafiante: ");
        es2 = ler.nextInt();
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[es1], l[es2]);
        UEC01.Lutar();
    }
}