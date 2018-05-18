import javax.swing.*;

public class Exercicio10{

   public static void main(String[] args){

double moeda1, moeda2 , moeda3, moeda4 , moeda5 , moeda6;

moeda1 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 1 centavo"));
moeda2 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 5 centavo"));
moeda3 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 10 centavo"));
moeda4 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 25 centavo"));
moeda5 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 50 centavo"));
moeda6 = Double.parseDouble(JOptionPane.showInputDialog("quantas moedas de 1 real"));

moeda1 = (moeda1)*0.01;
moeda2 = moeda2*0.05;
moeda3 = moeda3*0.10;
moeda4 = moeda4*0.25;
moeda5 = moeda5*0.50;
moeda6 = moeda6*1;

double total = moeda1 + moeda2 + moeda3 + moeda4 + moeda5 + moeda6 ;
JOptionPane.showMessageDialog(null,total);

}
}
