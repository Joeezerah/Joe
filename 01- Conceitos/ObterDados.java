import javax.swing.*;

public class ObterDados{

      public static void main(String[] args){
       
           //Vari�vel
           String nome;
           int idade;
           double media;          
 
          //obter o nome
          nome = JOptionPane.showInputDialog("Qual � o seu nome?");
         
          //obter a idade
          idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a sua idade?"));
    
          //obter a m�dia
          media = Double.parseDouble(JOptionPane.showInputDialog("Qual � a sua m�dia?"));
          
          //Mensagem contendo o nome digitado
          //JOptionPane.showMessageDialog(null, "Boa Tarde "+nome);
          //JOptionPane.showMessageDialog(null, "Voc� tem "+idade+" anos");
          //JOptionPane.showMessageDialog(null, "E obteve m�dia "+media);
          
          String texto ="Boa tarde "+nome;
                 texto += "\nVoc� tem "+idade+" anos";
                 texto += "\nE obteve m�dia "+media;
            
          JOptionPane.showMessageDialog(null, texto);    
    
         
     }

}