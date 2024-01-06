package com.mycompany.testefuncao02;
public class TesteFuncao02 {
    
    
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
     
    public static void main(String[] args) {
       int sm = soma(5,2);
       System.out.println("a soma vale " + sm);
    } 
}
