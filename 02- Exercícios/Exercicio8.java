import javax.swing.*;

public class Exercicio8{

   public static void main(String[] args){

//Variaveis
Object[] operacoes = {"soma" , "subtra��o" , "multiplica��o" , "divis�o"};
double nr1 , nr2 ;
double valor;


nr1 = Double.parseDouble(JOptionPane.showInputDialog("digite seu numero"));
nr2 = Double.parseDouble(JOptionPane.showInputDialog("digite seu numero"));

Object escolha = JOptionPane.showInputDialog(null, "Escolha sua opera��o", "Calculadora" , JOptionPane.PLAIN_MESSAGE, null, operacoes , "");

if (escolha.equals("soma")){valor =nr1+nr2;JOptionPane.showMessageDialog(null,valor) ;}
else if (escolha.equals("subtra��o")){valor =nr1-nr2;JOptionPane.showMessageDialog(null,valor);}
else if (escolha.equals("multiplica��o")){valor=nr1*nr2;JOptionPane.showMessageDialog(null,valor);}
else {valor=nr1/nr2;JOptionPane.showMessageDialog(null,valor);}

}
}