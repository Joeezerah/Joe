import javax.swing.*;

public class Exercicio5{

public static void main (String [] args){

 //Variaveis
 int dia;
 
 dia =Integer.parseInt(JOptionPane.showInputDialog ("Informe o dia do mes"));

 if ((dia >= 29) || (dia <= 0)){JOptionPane.showMessageDialog(null,"Data inválida");}
 else if ((dia == 3) || (dia == 4) || (dia == 10) || (dia == 11) || (dia == 17) || (dia == 18) || (dia == 24)|| (dia == 25))
 {JOptionPane.showMessageDialog(null,"Fim de semana");}
 else {JOptionPane.showMessageDialog(null,"Dia de semana");}

}
}