//Importar classe
import javax.swing.*;

public class ExibirMensagem{

  
   public static void main(String[] args){
    
 
     //Mensagem Simples
     JOptionPane.showMessageDialog(null,"Hello world");

     //Mensagem de Apenas texto
     JOptionPane.showMessageDialog(null,"Apenas texto","T�tulo",-1);

     //Mensagem de Erro
     JOptionPane.showMessageDialog(null,"Mensagem de erro","T�tulo",0);
    
     //Mensagem de Informa��o
     JOptionPane.showMessageDialog(null,"Informa��o","T�tulo",1);
     
     //Mensagem de Alerta
     JOptionPane.showMessageDialog(null,"Alerta","T�tulo",2);

     //Mensagem de Pergunta
     JOptionPane.showMessageDialog(null,"Pergunta","T�tulo",3);
     
    }

} 