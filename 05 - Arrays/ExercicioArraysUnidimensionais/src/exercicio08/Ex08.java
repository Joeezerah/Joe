package exercicio08;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		//variaveis
		String [] login = {"Naruto", "Sasuke", "Madara"};
		String [] senha = {"Naruto", "Sasuke", "Madara"};
		String logan = "";
		String senham = "";
		boolean acertou = false;

		while (acertou == false) {
			logan=JOptionPane.showInputDialog("informe seu login");
			senham=JOptionPane.showInputDialog("informe sua senha");

			for (int i = 0; i < senha.length; i++) {

				if((logan.equals(login[i])) && (senham.equals(senha[i]))){
					JOptionPane.showMessageDialog(null,"Login Realizado com sucesso");
					acertou = true;
				}else{
					JOptionPane.showMessageDialog(null,"Usuario ou senha incorreto");
					acertou = false;
				}
			}


		}
	}

}
