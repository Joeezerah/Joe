import javax.swing.*;

public class ObterDados{

      public static void main(String[] args){
       
           //Variável
           String nome;
           int idade;
           double media;          
 
          //obter o nome
          nome = JOptionPane.showInputDialog("Qual é o seu nome?");
         
          //obter a idade
          idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
    
          //obter a média
          media = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua média?"));
          
          //Mensagem contendo o nome digitado
          //JOptionPane.showMessageDialog(null, "Boa Tarde "+nome);
          //JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos");
          //JOptionPane.showMessageDialog(null, "E obteve média "+media);
          
          String texto ="Boa tarde "+nome;
                 texto += "\nVocê tem "+idade+" anos";
                 texto += "\nE obteve média "+media;
            
          JOptionPane.showMessageDialog(null, texto);    
    
         
     }

}