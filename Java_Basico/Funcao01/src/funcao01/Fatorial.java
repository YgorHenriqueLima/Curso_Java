package funcao01;
public class Fatorial {
    // aqui estou criando atributos
    
    // vou criar o atributo num que vai ser o numero do fatorial que quero calcular
    private int num = 0;
    // o resultado do fatorial
    private int fat = 1;
    // uma string com a formula
    private String formula = "";
    
    // a partir daqui vai criar 3 métodos
    public void setValor(int n) {
        
        num = n; // num que é meu atributo principal vai receber o n parâmetro
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){  
            // começando do maior numero, meu contador vai começar com o numero e enquanto o contador for maior do que 1 tiro uma unidade
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    
    public String getFormula(){
        return formula;
    }
            
}
