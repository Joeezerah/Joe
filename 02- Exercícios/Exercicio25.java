import javax.swing.*;

public class Exercicio25 {

public static void main (String [] args){

//variaveis
int hora;

hora = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora"));

if (hora <7){JOptionPane.showMessageDialog(null,"Boa Madrugada");}
else if (hora <12){JOptionPane.showMessageDialog(null,"Bom Dia");}
else if (hora <19){JOptionPane.showMessageDialog(null,"Boa Tarde");}
else{JOptionPane.showMessageDialog(null,"Boa Noite");}


}
}