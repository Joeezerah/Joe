import javax.swing.*;

public class Exercicio21{

public static void main (String[] args){

Object[] produtos = {"Calça" , "Camisa", "Casaco", "Meias" , "Paleto"};
Object[] pagamentos = {"Á Vista" , "Á prazo 30 Dias", "Á Prazo 60 dias"};

Object produto = JOptionPane.showInputDialog(null, "Escolha seu Produto", "Produtos" , JOptionPane.PLAIN_MESSAGE, null, produtos, "");

if(produto.equals("Calça")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha Método de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("Á Vista")){
		JOptionPane.showMessageDialog(null,"Preço Calça = R$ 150");
	} else if (pagamento.equals("Á prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Preço Calça = R$ 165");}
          else  {JOptionPane.showMessageDialog(null,"Preço Calça = R$ 180");}
}
else if(produto.equals("Camisa")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha Método de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("Á Vista")){
		JOptionPane.showMessageDialog(null,"Preço Camisa = R$ 300");
	} else if (pagamento.equals("Á prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Preço Camisa = R$ 330");}
          else  {JOptionPane.showMessageDialog(null,"Preço Camisa = R$ 360");}
}
else if(produto.equals("Casaco")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha Método de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("Á Vista")){
		JOptionPane.showMessageDialog(null,"Preço Casaco = R$ 250");
	} else if (pagamento.equals("Á prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Preço Casaco = R$ 275");}
          else  {JOptionPane.showMessageDialog(null,"Preço Casaco = R$ 300");}
}
else if(produto.equals("Meias")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha Método de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("Á Vista")){
		JOptionPane.showMessageDialog(null,"Preço Meia = R$ 30");
	} else if (pagamento.equals("Á prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Preço Meia = R$ 33");}
          else  {JOptionPane.showMessageDialog(null,"Preço Meia = R$ 36");}
}
else{
Object pagamento = JOptionPane.showInputDialog(null, "Escolha Método de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("Á Vista")){
		JOptionPane.showMessageDialog(null,"Preço Paleto = R$ 450");
	} else if (pagamento.equals("Á prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Preço Paleto = R$ 495");}
          else  {JOptionPane.showMessageDialog(null,"Preço Paleto = R$ 540");}
}


}
}