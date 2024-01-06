package com.mycompany.aula06;
public class Aula06 {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setIdade(18);
        p1.setSexo("M");
        p1.setCurso("Informática");
        
        p2.setNome("Cláudio");
        p2.setIdade(42);
        p2.setSexo("M");
        p2.setSalario(2500.75f);
        
        p3.setNome("Fabiana");
        p3.setIdade(34);
        p3.setSexo("F");
        p3.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
    }
}
