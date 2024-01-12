package com.mycompany.aula09;
public class Aula09 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        // reação do cachorro a alguma frase
        c.reagir("vai apanhar!");
        
        // diferentes reações do cachorro de acordo com o horário 
        c.reagir(11, 45); 
        c.reagir(19, 00);
        
        // diferentes reações se for o dono do cachorro ou não
        c.reagir(true);
        c.reagir(false);
        
        // diferentes reações de acordo com a idade do cachorro e o peso dele 
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
    
}
