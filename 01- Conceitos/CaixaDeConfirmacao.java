import javax.swing.*;

public class CaixaDeConfirmacao{


       public static void main(String[] args){

          //Pergunta 1
          int resposta1 = JOptionPane.showConfirmDialog(null, "Est� gostando de java?");
         
          //Resposta
          JOptionPane.showMessageDialog(null, resposta1);
  
          //Pergunta 2
          int resposta2 = JOptionPane.showConfirmDialog(null, "pergunta" , "t�tulo", 2); 
   }

}