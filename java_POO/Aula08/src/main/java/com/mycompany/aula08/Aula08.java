package com.mycompany.aula08;
public class Aula08 {
    public static void main(String[] args) {
       
        // Animal n = new Animal(); <- está errado pois a classe animal é abstrato
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartagura = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        cachorro.abanarRabo();
        cachorro.emitirSom();
        
        
        cobra.setCorEscama("Vermelha");
        cobra.emitirSom();
        System.out.println(cobra.getCorEscama());
    }
}
