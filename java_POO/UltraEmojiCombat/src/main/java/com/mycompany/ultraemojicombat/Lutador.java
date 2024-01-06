package com.mycompany.ultraemojicombat;
public final class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empate;
    private float altura, peso;
    private int experiencia, forca, velocidade;
    
    //métodos construtor

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpate(em);
       
    }
    

    Lutador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    //metodos acessores e modificadores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3){
            this.categoria = "leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "médio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "inválido";
        }
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    
     //metodos
    public void apresentar(){
        System.out.println("------------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o Lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " Anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + " KG");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpate());
        System.out.println("---------------------------------------------------------------");
    }    
    public void Status(){
        System.out.println("----------------------------------------------------------");
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates"); 
        System.out.println("---------------------------------------------------------");
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);        
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpate(getEmpate() + 1);
    }
    

    
}

