package com.mycompany.condicaosimples;

import javax.swing.JOptionPane;

public class CondicaoSimples {
    public static void main(String[] args) {
      float n1, n2, m;
      n1 = Float.parseFloat(JOptionPane.showInputDialog("N1: "));
      n2 = Float.parseFloat(JOptionPane.showInputDialog("N2: "));
      m = (n1+n2)/2;
      JOptionPane.showMessageDialog(null, m);
      if (m>6) {
          JOptionPane.showMessageDialog(null, "parabéns pequeno gafanhoto!");
      }else {
          JOptionPane.showMessageDialog(null, "que pena, tente na próxima e estude mais");
      }
    }
};