package exercicio03;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		//variaveis
		int[] nr1 = new int [5];
		int indice = 0 ;
		
		
		
		do{
			nr1[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe 5 numeros"));
			indice++;
			
		
		}while (indice < 5);
		
		for(int a = 0 ; a <5; a++){
			if (nr1[a] == 10){
				System.out.println("O valor 10 esta na posiçao " + a);
			}
			else {
				System.out.println("Não Foi encontrado nenhum numero 10 na posição "+ a);
			}
			
			
		}
		
		
		
		

	}

}
