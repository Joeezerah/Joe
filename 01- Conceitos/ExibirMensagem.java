//Importar classe
import javax.swing.*;

public class ExibirMensagem{

  
   public static void main(String[] args){
    
 
     //Mensagem Simples
     JOptionPane.showMessageDialog(null,"Hello world");

     //Mensagem de Apenas texto
     JOptionPane.showMessageDialog(null,"Apenas texto","Título",-1);

     //Mensagem de Erro
     JOptionPane.showMessageDialog(null,"Mensagem de erro","Título",0);
    
     //Mensagem de Informação
     JOptionPane.showMessageDialog(null,"Informação","Título",1);
     
     //Mensagem de Alerta
     JOptionPane.showMessageDialog(null,"Alerta","Título",2);

     //Mensagem de Pergunta
     JOptionPane.showMessageDialog(null,"Pergunta","Título",3);
     
    }

} 