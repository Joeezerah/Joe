import javax.swing.*;
 
public class Exercicio15{

public static void main (String[] args){

//variaveis
int dia;
Object[] apartamentos = {"Apto Simples" , "Apto duplo", "Suite luxo"};
dia = Integer.parseInt(JOptionPane.showInputDialog("Diaria"));

Object avestruz = JOptionPane.showInputDialog(null, "Escolha seu quarto", "Diarias" , JOptionPane.PLAIN_MESSAGE, null, apartamentos, "");

if (avestruz.equals("Apto Simples")){dia = dia*45; JOptionPane.showMessageDialog(null," A sua estadia : "+dia );}
else if (avestruz.equals("Apto duplo")){dia = dia*65; JOptionPane.showMessageDialog(null," A Sua estadia Custa : "+dia );}
else {dia = dia*110; JOptionPane.showMessageDialog(null," A sua estadia Custa : "+dia );}


}
}
