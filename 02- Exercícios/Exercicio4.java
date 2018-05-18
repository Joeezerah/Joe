import javax.swing.*;

public class Exercicio4{

public static void main(String[] args){

 //Variaveis
 String nome;
 double valor;
 Object [] pagamentos = {"a vista" , " a prazo " , "cartao"};

 nome = JOptionPane.showInputDialog("Informe o nome do seu produto");
 valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));
 Object pagamento = JOptionPane.showInputDialog(null, "Escolha sua forma de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");

 if ((pagamento.equals("a vista"))&&(valor>500)){
	valor =valor*0.90;
   JOptionPane.showMessageDialog(null,"O produto " + nome + " custara " + valor);}
   else{JOptionPane.showMessageDialog(null,"O produto " + nome + " custara " + valor);}
   
}
}

 

  