package exercicio02;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		//variaveis
		int[] valor = new int [10];
		int indice = 0;
		
		
		do{
			valor[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe 10 numeros"));
			indice++;
			
		
		}while (indice < 10);
		
		for (int a = 9 ; a > -1; a--){
			System.out.println(valor[a]);
		}
		
		
	
		
			
		

	}

}
