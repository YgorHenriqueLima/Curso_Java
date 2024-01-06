package com.mycompany.aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void Status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada: " + this.tampada);
    }
    
   public void Rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar");
        }else {
            System.out.println("rabiscar");
        }
    }
    
   public void Tampar() {
        this.tampada = true;
        
    }
    
   public void Destampar() {
        this.tampada = false;
    }
}
