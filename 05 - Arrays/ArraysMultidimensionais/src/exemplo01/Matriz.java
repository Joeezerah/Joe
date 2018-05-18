package exemplo01;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		
		//Array multidimensional - matriz
		String[][] dados = new String [3][3];
		
		//Laço
		for(int indice = 0;indice <3;indice++){
			
			//Nome
			dados[indice][0] = JOptionPane.showInputDialog("Nome");
			
			//Idade
			dados[indice][1] = JOptionPane.showInputDialog("Idade");
			
			//Cidade
			dados[indice][2] = JOptionPane.showInputDialog("Cidade");
			
		}
		
		//Exibir dados
		String exibir = "Dados informados:\n";
				exibir += "Linhas: "+dados.length+"\n";
				exibir += "Colunas: "+dados[0].length+"\n";
		
		for (int i = 0; i < 3; i++) {
			
			exibir += "\nNome: "+dados[i][0];
			exibir += "\nIdade: "+dados[i][1];
			exibir += "\nCidade: "+dados[i][2];
			exibir += "\n-----------------------";
		}
		
		JOptionPane.showMessageDialog(null, exibir);

	}

}
