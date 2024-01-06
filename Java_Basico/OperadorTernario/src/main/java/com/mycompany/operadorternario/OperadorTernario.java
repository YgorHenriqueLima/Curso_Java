package com.mycompany.operadorternario;
public class OperadorTernario {

    public static void main(String[] args) {
        /*int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0:1;
        System.out.print("resultado: " + r);*/
        
        String nome1 = "gustavo";
        String nome2 = "gustavo";
        String nome3 = new String("gustavo");
        String res;
        res = (nome1.equals(nome3)) ? "igual":"diferente";
        System.out.println(res);
    }
}
