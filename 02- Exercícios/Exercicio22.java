import javax.swing.*;

public class Exercicio22 {

public static void main (String [] args){

double lado1 , lado2 , lado3 , lado4 ;

lado1 =Double.parseDouble(JOptionPane.showInputDialog("Informe lado 1"));
lado2 =Double.parseDouble(JOptionPane.showInputDialog("Informe lado 2"));
lado3 =Double.parseDouble(JOptionPane.showInputDialog("Informe lado 3"));
lado4 =Double.parseDouble(JOptionPane.showInputDialog("Informe lado 4"));

if ((lado1 == lado2) && (lado1 == lado3) && (lado1 == lado4)){JOptionPane.showMessageDialog(null,"É um quadrado");}
else {JOptionPane.showMessageDialog(null,"Não é um quadrado");}

}
}