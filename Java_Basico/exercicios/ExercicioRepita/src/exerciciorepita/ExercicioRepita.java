package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        float n, soma = 0, totvalor = 0, totpar = -1, totimpar = 1, maisdecem = 0, media = 0;
        do {
            n = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "<html>Informe um Número(<strong>Valor 0 interrompe</strong>): </html>"));
            soma += n;
            totvalor++;
            if (n % 2 == 0) {
                totpar++;
            } else {
                totimpar++;
            }
            if (n >= 100) {
                maisdecem++;
            }

        } while (n != 0);
        media = soma / totvalor;
        
        JOptionPane.showMessageDialog(null,
                "<html>Resultado: <br>" + "total de valores: " + totvalor + "<br>A soma dos valores: " + soma
                + "<br>Total de pares" + totpar + "<br>Total de Impares" + totimpar + "<br>Acima de 100: " + maisdecem + "<br>"
                + "Média dos valores: " + media);

    }
}
