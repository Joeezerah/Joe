import javax.swing.*;

public class Exercicio9{

public static void main (String[] args){

//variaveis
double nr1 ,nr2 , nr3;

nr1 = Double.parseDouble(JOptionPane.showInputDialog("digite seu primeiro numero"));
nr2 = Double.parseDouble(JOptionPane.showInputDialog("digite seu segundo numero"));
nr3 = Double.parseDouble(JOptionPane.showInputDialog("digite seu terceiro numero"));

if ((nr1 < nr2) && (nr1 < nr3)){JOptionPane.showMessageDialog (null,nr1);}
else if ((nr2 < nr1) && (nr2 < nr3)){JOptionPane.showMessageDialog (null,nr2);}
else {JOptionPane.showMessageDialog (null,nr3);}

}
}

