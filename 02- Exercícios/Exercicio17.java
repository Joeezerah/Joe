import javax.swing.*;

public class Exercicio17 {

public static void main (String[] args){

//Variaveis
double nr1 , nr2;
double resultado;

nr1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Um N�mero")) ;
nr2 = Double.parseDouble(JOptionPane.showInputDialog("Digite Um N�mero")) ;

JOptionPane.showMessageDialog(null, (nr1/nr2));


}
}

