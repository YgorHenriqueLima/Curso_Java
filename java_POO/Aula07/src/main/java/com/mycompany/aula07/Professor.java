package com.mycompany.aula07;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void PagarMensalidade(){
        System.out.println("você pagou a mensalidade");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
