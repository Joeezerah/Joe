import javax.swing.*;

public class Exercicio2{

 public static void main (String[] args){

 //Variáveis
 double valor;
 
   valor=Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor"));
   valor=valor*0.90;
   
  JOptionPane.showMessageDialog (null,valor);

}

}


 