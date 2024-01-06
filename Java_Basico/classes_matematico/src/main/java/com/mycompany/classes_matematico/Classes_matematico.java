package com.mycompany.classes_matematico;
public class Classes_matematico {
    public static void main(String[] args) {
        /*
        float v = 8.3f;
        int ar = (int) Math.ceil(v);
        System.out.println(ar);
        */
        
        double aleatorio = Math.random();
        int n = (int) (5 + aleatorio * (10-5));
        System.out.println(n);
    }
}
