package com.mycompany.aula08;
public class Cachorro extends Mamifero {
    
    public void enterrarOsso(){
        System.out.println("enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("abanando rabo");
    }
    
    @Override
    public void locomover() {
        System.out.println("correndo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
}
