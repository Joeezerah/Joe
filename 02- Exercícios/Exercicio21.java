import javax.swing.*;

public class Exercicio21{

public static void main (String[] args){

Object[] produtos = {"Cal�a" , "Camisa", "Casaco", "Meias" , "Paleto"};
Object[] pagamentos = {"� Vista" , "� prazo 30 Dias", "� Prazo 60 dias"};

Object produto = JOptionPane.showInputDialog(null, "Escolha seu Produto", "Produtos" , JOptionPane.PLAIN_MESSAGE, null, produtos, "");

if(produto.equals("Cal�a")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha M�todo de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("� Vista")){
		JOptionPane.showMessageDialog(null,"Pre�o Cal�a = R$ 150");
	} else if (pagamento.equals("� prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Pre�o Cal�a = R$ 165");}
          else  {JOptionPane.showMessageDialog(null,"Pre�o Cal�a = R$ 180");}
}
else if(produto.equals("Camisa")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha M�todo de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("� Vista")){
		JOptionPane.showMessageDialog(null,"Pre�o Camisa = R$ 300");
	} else if (pagamento.equals("� prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Pre�o Camisa = R$ 330");}
          else  {JOptionPane.showMessageDialog(null,"Pre�o Camisa = R$ 360");}
}
else if(produto.equals("Casaco")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha M�todo de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("� Vista")){
		JOptionPane.showMessageDialog(null,"Pre�o Casaco = R$ 250");
	} else if (pagamento.equals("� prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Pre�o Casaco = R$ 275");}
          else  {JOptionPane.showMessageDialog(null,"Pre�o Casaco = R$ 300");}
}
else if(produto.equals("Meias")){
Object pagamento = JOptionPane.showInputDialog(null, "Escolha M�todo de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("� Vista")){
		JOptionPane.showMessageDialog(null,"Pre�o Meia = R$ 30");
	} else if (pagamento.equals("� prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Pre�o Meia = R$ 33");}
          else  {JOptionPane.showMessageDialog(null,"Pre�o Meia = R$ 36");}
}
else{
Object pagamento = JOptionPane.showInputDialog(null, "Escolha M�todo de pagamento", "Caixa" , JOptionPane.PLAIN_MESSAGE, null, pagamentos, "");
	if (pagamento.equals("� Vista")){
		JOptionPane.showMessageDialog(null,"Pre�o Paleto = R$ 450");
	} else if (pagamento.equals("� prazo 30 Dias")){
		JOptionPane.showMessageDialog(null,"Pre�o Paleto = R$ 495");}
          else  {JOptionPane.showMessageDialog(null,"Pre�o Paleto = R$ 540");}
}


}
}