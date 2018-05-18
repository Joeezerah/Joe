import javax.swing.*;

public class Exercicio18{

public static void main (String [] args){

//variaveis
double le , ld , li;

le = Double.parseDouble (JOptionPane.showInputDialog("Digite Comprimento Do Primeiro Lado"));
ld = Double.parseDouble (JOptionPane.showInputDialog("Digite Comprimento Do Segundo Lado"));
li = Double.parseDouble (JOptionPane.showInputDialog("Digite Comprimento Do Terceiro Lado"));

if ((ld > (li+le)) || (le > (ld+li)) || (li > (ld+le))) {JOptionPane.showMessageDialog(null,"Não é um triângulo");}
else if (( li == ld) && ( le == li )) {JOptionPane.showMessageDialog(null,"Triangulo equilatero");} 
else if ((( li == ld) && ( li != le )) || (( ld == le) && (li != le)) || ((li == le ) && (li != ld))){JOptionPane.showMessageDialog(null,"Triangulo Isosceles");}
else {JOptionPane.showMessageDialog(null,"Triangulo Escaleno");}
  


}

}