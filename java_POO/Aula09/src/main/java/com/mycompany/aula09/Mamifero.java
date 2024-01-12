package com.mycompany.aula09;
public class Mamifero extends Animal {
    protected String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do mamífero");
    }
    
}
