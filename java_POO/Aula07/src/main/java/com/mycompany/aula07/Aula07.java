package com.mycompany.aula07;
public class Aula07 {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(40);
        v1.setSexo("M");
        v1.toString();
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setMatricula(1111);
        a1.setCurso("informatica");
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
    
}
