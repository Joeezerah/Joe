package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		//Matriz
		int [][] numeros = new int [5][6];
		int par =0;
		int impar =0;
		double media =0;
		int qtmedia =0;
		int num = 0;
		int total = 0;
		String texto = " ";


		//laço
		for (int linha =0; linha <5; linha++){

			for (int coluna =0; coluna <6; coluna++){

				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				num = numeros[linha][coluna];
				if (num%2 == 0){
					par++;  
				}else{
					impar++;
				}
				total += numeros[linha][coluna];
			}



		}



		media = (total/30);

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				
				num = numeros[linha][coluna];
				if (num >= media){
					qtmedia++;

				}
			}
		}


		JOptionPane.showMessageDialog(null, "\nA quantidade de numeros pares é : " +par+
				"\nA quantidade De numeros impares é : " +impar+
				"\nA Média Dos numeros informados é : " +media+
				"\nA Quantidade de numeros iguais ou maiores que a média : " +qtmedia);


		texto = "tabela\n\n";
		for (int linha =0; linha <5; linha++){

			for (int coluna =0; coluna <6; coluna++){

				texto += numeros[linha][coluna]+ " " ;

			}
			texto += "\n";

		}
		JOptionPane.showMessageDialog(null,texto);

















	}



}
