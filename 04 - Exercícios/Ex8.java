import javax.swing.*;

/**
 * Ex8
 */
public class Ex8 {

  public static void main(String[] args) {
      
//variaveis
double nr;

nr = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
JOptionPane.showMessageDialog(null , (nr + 1)+ "\n " +(nr + 2) + "\n " +(nr + 3)+ "\n " + (nr + 4) + "\n " + (nr +5) + "\n "+
(nr + 6)+ "\n " +(nr + 7) + "\n " +(nr + 8)+ "\n " + (nr + 9) + "\n " + (nr +10) + "\n" +
(nr - 1)+ "\n " +(nr - 2) + "\n " +(nr - 3)+ "\n " + (nr - 4) + "\n " + (nr - 5) + " \n " +
(nr - 6)+ "\n " +(nr - 7) + "\n " +(nr - 8)+ "\n " + (nr - 9) + "\n " + (nr - 10));



  }
}
