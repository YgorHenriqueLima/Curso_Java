package com.mycompany.aula02;
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 50;
        c1.Tampar();
        c1.Status();
        c1.Rabiscar();
  
        
        Caneta c2 = new Caneta();
        c2.modelo = "Faber Castel";
        c2.cor = "Vermelho";
        //c2.ponta = 1.0f;
        c2.carga = 90;
        c2.Destampar();
        c2.Status();
        c2.Rabiscar();
        
    }
    
}
