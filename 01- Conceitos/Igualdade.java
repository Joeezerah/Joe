import javax.swing.*;

public class Igualdade{

   public static void main (String[] args){

     //Vari�veis
     String nome1, nome2;
    
     //Pedir os dois nomes
     nome1 = JOptionPane.showInputDialog("1� nome");
     nome2 = JOptionPane.showInputDialog("2� nome");

     //Condicional
     if(nome1.equals(nome2)){
        JOptionPane.showMessageDialog(null,"Iguais");
    }else{
        JOptionPane.showMessageDialog(null,"Diferentes");
}

  }

}