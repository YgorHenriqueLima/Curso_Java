package com.mycompany.aula08;
public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("construindo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("emitindo som de ave...");
    }
}
