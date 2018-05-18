import javax.swing.*;

public class Exercicio1 {

   public static void main(String[] arfs){

    String nome;
    String idade;
    String cidade;
   
    nome = JOptionPane.showInputDialog ("Seu nome ?");
    idade = JOptionPane.showInputDialog ("Sua idade ?");
    cidade = JOptionPane.showInputDialog ("sua cidade ?");


    String mensagem = "Boa tarde " +nome;
           mensagem +=",você tem " +idade;
           mensagem += " anos e mora em " +cidade;

    JOptionPane.showMessageDialog (null, mensagem);

}

}