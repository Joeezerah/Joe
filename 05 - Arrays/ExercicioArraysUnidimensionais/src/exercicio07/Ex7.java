package exercicio07;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		//variaveis
		int[] nr = new int [7];
		int indice = 0;
		int num = 0;
		boolean valido = false;
		
		while (indice <=6) {
			do{
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "+ indice));
				valido = true;
				for (int i = 0; i < nr.length; i++) {
					if(num == nr[i]){
						valido = false;
					}
				}
			}while(valido == false);
			nr[indice] = num;
			valido = false;
			indice++;
		}
		
		
		
		for (int a=0; a < 7; a++){
			System.out.println(nr[a]);
		}
		
		
	}

}
