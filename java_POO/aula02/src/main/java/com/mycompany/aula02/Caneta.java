package com.mycompany.aula02;
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
    
    void Rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar");
        }else {
            System.out.println("rabiscar");
        }
    }
    
    void Tampar() {
        this.tampada = true;
        
    }
    
    void Destampar() {
        this.tampada = false;
    }
}
