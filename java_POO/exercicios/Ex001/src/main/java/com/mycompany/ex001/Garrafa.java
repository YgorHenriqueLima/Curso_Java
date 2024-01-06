package com.mycompany.ex001;
public class Garrafa {
    
    String cor, marca, material;
    boolean cheio, tampada;
    float volume;
   
    
    void Status(){
        System.out.println("marca: " + this.marca);
        System.out.println("cor: " + this.cor);
        System.out.println("material: " + this.material);
        System.out.println("Volume(ml): " + this.volume);
        System.out.println("esta tampada?: " + this.tampada);
        
    }
    
    
    
    void Encher(){
        if (this.cheio == false) {
            System.out.println("encher");
        }else{
            System.out.println("já está cheio");
        }
    }
    
    void Tomar(){
        if (this.tampada == true) {
            System.out.println("está tampada");
        }else{
            System.out.println("tomar");
        }
    }
    
    void Tampar(){
        this.tampada = true;
    }
    
    void Destampar(){
        this.tampada = false;
    }
}
