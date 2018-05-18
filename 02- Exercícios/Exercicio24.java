import javax.swing.*;

public class Exercicio24 {


public static void main (String [] args){

double valor1 , valor2 , valor3 ;

valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe Um Numero"));
valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe Um Numero"));
valor3 = Double.parseDouble(JOptionPane.showInputDialog("Informe Um Numero"));

if ((valor1 <= valor2) && (valor1 <= valor3) && (valor2 <= valor3)){JOptionPane.showMessageDialog(null,valor1 + " " + valor2 + " " + valor3 );} 
else if ((valor1 <= valor2) && (valor1 <= valor3) && (valor3 <= valor2)){JOptionPane.showMessageDialog(null,valor1 + " " + valor3 + " " + valor2 );} 
else if ((valor2 <= valor1) && (valor1 <= valor3) && (valor2 <= valor3)){JOptionPane.showMessageDialog(null,valor2 + " " + valor1 + " " + valor3 );} 
else if ((valor2 <= valor1) && (valor3 <= valor1) && (valor2 <= valor3)){JOptionPane.showMessageDialog(null,valor2 + " " + valor3 + " " + valor1 );} 
else if ((valor3 <= valor2) && (valor3 <= valor1) && (valor1 <= valor2)){JOptionPane.showMessageDialog(null,valor3 + " " + valor1 + " " + valor2 );} 
else {JOptionPane.showMessageDialog(null,valor3 + " " + valor2 + " " + valor1 );} 



}
}
