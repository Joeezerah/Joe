package exercicio2;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		//Variaveis
		String palavra;
		int qtvogais = 0;

		palavra = JOptionPane.showInputDialog("Insira a palavra");
		palavra = palavra.toLowerCase();

		for (int i = 0; i < palavra.length(); i++) {

			if (String.valueOf(palavra.charAt(i)).equals("a")){
				qtvogais++;
			}else if (String.valueOf(palavra.charAt(i)).equals("e")){
				qtvogais++;
			}else if (String.valueOf(palavra.charAt(i)).equals("i")){
				qtvogais++;
			}else if (String.valueOf(palavra.charAt(i)).equals("o")){
				qtvogais++;
			}else if (String.valueOf(palavra.charAt(i)).equals("u")){
				qtvogais++;
			}

		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de vogais e: " +qtvogais);



	}

}



