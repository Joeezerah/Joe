import javax.swing.*;

public class Exercicio26{

public static void main (String [] args){

//variaveis
int idade ; 
String nome , classif ;

idade = Integer.parseInt(JOptionPane.showInputDialog("Informe Sua Idade"));
nome = JOptionPane.showInputDialog("Informe Seu Nome");

if (idade <5){classif="Idade Bebe";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <12){classif="Idade Criança";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <15){classif="Idade Adolescente";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <31){classif="Idade Jovem";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <46){classif="Idade Madura";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <61){classif="Idade Adulto";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <76){classif="Idade Idoso 1";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else if (idade <91){classif="Idade Idoso 1";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 
else {classif="Idade Idoso 3";JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n Classificação: "+classif);} 


}
}