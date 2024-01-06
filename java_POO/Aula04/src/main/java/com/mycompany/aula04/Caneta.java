package com.mycompany.aula04;
public final class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    
    
    public void Status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
    }
}
