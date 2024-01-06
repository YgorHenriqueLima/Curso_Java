package com.mycompany.ex001;
public class Ex001 {

    public static void main(String[] args) {
       Garrafa g1 = new Garrafa();
       g1.marca = "indaiá";
       g1.cor = "Transparente";
       g1.material = "Plástico";
       g1.volume = 500;
       g1.tampada = false;
       g1.cheio = false;
       
     
       g1.Status();
       
       g1.Destampar();
       g1.Encher();
       g1.Tomar();
    }
}
