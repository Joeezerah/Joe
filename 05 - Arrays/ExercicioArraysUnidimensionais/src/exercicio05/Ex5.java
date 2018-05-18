package exercicio05;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		//variaveis
		int indice = 0;
		int[] nr1 = new int [15];
		int soma = 0;
		double media = 0;
		int qtmaiorigualmedia = 0;
		int qtneutros = 0;
		int qtnegativos = 0;
		int qtpositivos = 0;
		int mnr = -1000000000;
		int menr = 1000000000;
		int nrp = 0;
		int nri = 0;
		
		do{
		nr1[indice] =Integer.parseInt(JOptionPane.showInputDialog("Insira 15 numeros"));
		indice++;
		
		
		}while (indice < 15);
		
		for (int a = 0; a < 15; a++){
			soma += nr1[a];
			if (nr1[a] == 0){
				qtneutros++;
			}
			if (nr1[a] > 0){
			qtpositivos++;
			}
			if (nr1[a] < 0){
			qtnegativos++;
			}
			if (nr1[a] < menr){
			menr = nr1[a];
			}
			if (nr1[a] > mnr){
			mnr = nr1[a];
			}
			if ((nr1[a]%2) == 0){
			nrp++;
			}
			else{
			nri++;
			}
	    
		}		
		
		for (int b =0; b <15; b++){
			media = soma/15;
			if (nr1[b] >= media){
			qtmaiorigualmedia++;
			}
			
	
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos Numeros são : " +soma+ 
				"\nA Média Dos Numeros é : " +media+ 
				"\nA Quantidade de numeros maiores ou igual a media : " +qtmaiorigualmedia+ 
				"\nQuantidade De Numeros Negativos : " +qtnegativos + 
				"\nQuantidade De Numeros Neutros : " +qtneutros + 
				"\nQuantidade De Numeros Positivos : " +qtpositivos +
				"\nO Maior Numero é : " +mnr +
				"\nO Menor Numero é : " +menr +
				"\nQuantidade De Numeros Pares : " +nrp + 
				"\nQuantidade De Numero Impares : "+nri );
		
			
		
	
	
	
	
		
		
		
		
		
		
		}
	}


