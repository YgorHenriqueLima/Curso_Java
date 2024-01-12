package com.mycompany.aula08;
public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo vegetal");
    }

    @Override
    public void emitirSom() {
        System.out.println("emitindo som de réptil...");
    }
}
