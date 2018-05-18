import javax.swing.*;

public class Exercicio3{

  public static void main (String[] args){
  
  double media;
  double media1;
  double media2;
  double media3;
  double media4;

 media1= Double.parseDouble(JOptionPane.showInputDialog("Informe sua media1"));
 media2= Double.parseDouble(JOptionPane.showInputDialog("Informe sua media2"));
 media3= Double.parseDouble(JOptionPane.showInputDialog("Informe sua media3"));
 media4= Double.parseDouble(JOptionPane.showInputDialog("Informe sua media4"));
 
 media = ((media1+media2+media3+media4)/4);
 if (media >=7){JOptionPane.showMessageDialog(null,"Aprovado");}
 else if ((media >=5) && (media <=6.9)){JOptionPane.showMessageDialog(null,"Em recuperação");}
 else {JOptionPane.showMessageDialog(null,"Reprovado");}

 


  
   }

}