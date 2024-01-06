package com.mycompany.ex002;
public final class ContaBanco {
    
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("--------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
        System.out.println("-----------------------------------------");
    }
    //-----------------------------métodos get e setter-----------------------------
  
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //--------------------------------------método construtor-------------------------------
   
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    
    //----------------------------------métodos --------------------------------------------------
    public void abrirConta(String t){
        
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharConta(){
        
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } 
        
        else if (this.getSaldo() < 0){
            System.out.println("a conta não pode ser fechada pois tem débito");
        } 
        
        else {
            this.setStatus(false);
        }
        
    }
    
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
         
        } else {
            System.out.println("impossível sacar de uma conta fechada");
        }
    }  
    
    public void pagarMensal(){
        int v = 0;     
        if (this.getTipo() == "CC"){
            v = 12;
        }
        
        else if (this.getTipo() == "CP"){
            v = 20;
        }
        
        if (this.isStatus()){
            if (this.getSaldo() > v){
                setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("saldo insuficiente");
            }
        } 
        
        else {
            System.out.println("impossível pagar");
        }
    }
    
}
