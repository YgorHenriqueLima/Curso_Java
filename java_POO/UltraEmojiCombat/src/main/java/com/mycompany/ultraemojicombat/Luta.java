package com.mycompany.ultraemojicombat;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds, VantagemDesafiante, VantagemDesafiado;
    private boolean aprovado;
    //métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
            
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void Lutar(){
        
        if (this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            // considerando vantagens
            // altura: se o desafiante ou desafiado é maior, ele ganha 2 de força e perde 1 de velocidade e vice versa
            if (this.desafiado.getAltura() > this.desafiante.getAltura()){
                
                this.desafiado.setForca(this.desafiado.getForca() + 2);
                this.desafiado.setVelocidade(this.desafiado.getVelocidade() - 1);
               
                this.desafiante.setVelocidade(this.desafiante.getVelocidade() + 2);
                this.desafiante.setForca(this.desafiante.getForca() - 1);
                
            } else if (this.desafiante.getAltura() > this.desafiado.getAltura()){
                
                this.desafiado.setForca(this.desafiado.getForca() - 1);
                this.desafiado.setVelocidade(this.desafiado.getVelocidade() + 2);
                
                
                this.desafiante.setForca(this.desafiante.getForca() + 2);
                this.desafiante.setVelocidade(this.desafiante.getVelocidade() - 1);  
            }
            // idade: Se o desafiante é mais Velho, ele ganha 3 de experiencia, mas perde 1 de velocidade e força
            if(this.desafiado.getIdade() > this.desafiante.getIdade()){
                
                this.desafiado.setExperiencia(this.desafiado.getExperiencia() + 3);
                this.desafiado.setVelocidade(this.desafiado.getVelocidade() - 1);
                this.desafiado.setForca(this.desafiado.getForca() - 1);
            
            }else if (this.desafiante.getIdade() > this.desafiado.getIdade()){
                
                this.desafiante.setExperiencia(this.desafiante.getExperiencia() + 3);
                this.desafiante.setVelocidade(this.desafiante.getVelocidade() - 1);
                this.desafiante.setForca(this.desafiante.getForca() - 1);
            
            }
            // peso: Se o desafiante é mais pesado, ele ganha 1 de força e perde 2 velocidade
            if (this.desafiado.getPeso() > this.desafiante.getPeso()){
                
                this.desafiado.setForca(this.desafiado.getForca() + 1);
                this.desafiado.setVelocidade(this.desafiado.getVelocidade() - 2);
                
                this.desafiante.setForca(this.desafiante.getForca() - 1);
                this.desafiante.setVelocidade(this.desafiante.getVelocidade() + 2);
            } 
            
            if (this.desafiante.getPeso() > this.desafiado.getPeso()){

                this.desafiado.setForca(this.desafiado.getForca() - 1);
                this.desafiado.setVelocidade(this.desafiado.getVelocidade() + 2);

                this.desafiante.setForca(this.desafiante.getForca() + 1);
                this.desafiante.setVelocidade(this.desafiante.getVelocidade() - 2);
            } 
              
            this.VantagemDesafiante = this.desafiante.getForca() + this.desafiante.getExperiencia() + this.desafiante.getVelocidade();
            this.VantagemDesafiado = this.desafiado.getForca() + this.desafiado.getExperiencia() + this.desafiado.getVelocidade();
            
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println("============= RESULTADO DA LUTA ==================");
            switch(vencedor){
                case 0: // empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;         
            
            } 
            System.out.println("===============================================");
        }else{
            System.out.println("a luta não pode acontecer");
        }
        
    }
    
    //métodos getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
