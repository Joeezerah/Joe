import javax.swing.*;

public class Exercicio13{

public static void main (String [] args){

//variaveis
double nr;

nr = Double.parseDouble (JOptionPane.showInputDialog("Digite um numero"));
JOptionPane.showMessageDialog(null,(nr+1)+" "+ (nr-1));

}
}