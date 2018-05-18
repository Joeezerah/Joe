import javax.swing.*;

public class Exercicio11{

public static void main (String[] args){

//variaveis
double media;
int faltas;
double nota1 , nota2 , nota3 , nota4 ;

nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota1"));
nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota2"));
nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota3"));
nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota4"));

media= ((nota1 + nota2 + nota3 + nota4)/4);

faltas = Integer.parseInt(JOptionPane.showInputDialog ("Informe suas faltas"));

if ((media == 10) && (faltas <15)){JOptionPane.showMessageDialog(null,"Parabéns");}
else if ((media >=7) && (faltas <15)) {JOptionPane.showMessageDialog(null,"Bom");}
else if ((media >=5.1) && (faltas <15)) {JOptionPane.showMessageDialog(null,"Em Exame");}
else {JOptionPane.showMessageDialog(null,"Reprovado");}


}
}
