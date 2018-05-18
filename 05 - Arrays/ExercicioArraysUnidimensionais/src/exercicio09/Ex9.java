package exercicio09;                   
 
import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		//variaveis
		String [] produto = new String [20];
		double [] valor = new double [20];
		int [] quant = new int [20];
		Object[] menu = {"Cadastrar Produto" , "Listar Produto", "Alterar Produto" , "Excluir Produto" , "Sair"};
		Object escolha = "";
		String produtu = "";
		double valor1 = 0;
		int qtdest = 0;
		int qtdProduto = -1;
		

		while (!escolha.equals("Sair")) {
			escolha = JOptionPane.showInputDialog(null, "Escolha Uma Opção", "Menu" , JOptionPane.PLAIN_MESSAGE, null, menu, "");
			if (escolha.equals("Cadastrar Produto")){
				qtdProduto++;
				produtu = JOptionPane.showInputDialog("Diga nome do seu produto");
				valor1 = Double.parseDouble(JOptionPane.showInputDialog("Diga o Valor do produto"));
				qtdest = Integer.parseInt(JOptionPane.showInputDialog("Diga a quantidade do produto"));
				produto[qtdProduto] = produtu;
				valor[qtdProduto] = valor1;
				quant[qtdProduto] = qtdest;
			} 
			if (escolha.equals("Listar Produto")) {
				for (int i = 0; i < produto.length; i++) {
					JOptionPane.showMessageDialog(null, "Produtos : " +produto[i]+ "\nValor : " +valor[i]+ "\nQuantidade De Produtos : " +quant[i]);
							
				}

			}
			if (escolha.equals("Alterar Produto")) {
				produtu = JOptionPane.showInputDialog("Diga nome do seu produto");
				for (int i = 0; i < produto.length; i++) {
					if (produtu.equals(produto[i])){
						produtu = JOptionPane.showInputDialog("Diga nome do seu produto");
						valor1 = Double.parseDouble(JOptionPane.showInputDialog("Diga o Valor do produto"));
						qtdest = Integer.parseInt(JOptionPane.showInputDialog("Diga a quantidade do produto"));
						produto[i] = produtu;
						valor[i] = valor1;
						quant[i] = qtdest;
					}
				} 
			}
			if (escolha.equals("Excluir Produto")){
				produtu = JOptionPane.showInputDialog("Diga nome do seu produto");
				for (int i = 0; i < menu.length; i++) {
					if (produtu.equals(produto[i])){
						
						produto[i] = null;
						valor[i] = 0.0;
						quant[i] = 0;
					
				} 
			}

		}


		}


	}

}
