import javax.swing.*;

public class Exercicio6 {

public static void main (String [] args){ 

//Variaveis
double numero1, numero2;
double valor ;

numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor"));
numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor"));

if (numero1 == numero2) {
valor =numero1 + numero2;
JOptionPane.showMessageDialog (null,valor);
}else {valor =numero1 * numero2 ;
JOptionPane.showMessageDialog (null,valor);}

}
}