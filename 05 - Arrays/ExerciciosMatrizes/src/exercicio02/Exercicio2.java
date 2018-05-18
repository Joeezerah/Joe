package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		//Matriz
		int [][] numeros = new int [5][5];
		String texto = "";
		int qtlinha =0 ;
		int sgcoluna = 0;
		int dp = 0;
		int ds = 0;
		String texto1 = "";
	
          for (int linha =0; linha <5; linha++){
			
			  for (int coluna =0; coluna <5; coluna++){

				  texto = "Linha : "+(linha+1) + "\nColuna : " +(coluna+1);
				  numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(texto));
			      
				  
				  
			  }
          }
			  
			
        for (int i = 0; i <5; i++) {
			qtlinha += numeros[3][i];
			sgcoluna += numeros[i][1];
			
		
        	
		}
        
        dp = numeros [0][0] + numeros [1][1] + numeros [2][2] + numeros [3][3] + numeros [4][4] ;
        ds = numeros [4][0] + numeros [3][1] + numeros [2][2] + numeros [1][3] + numeros [0][4] ;
        
        for (int linha =0; linha <5; linha++){
			
			  for (int coluna =0; coluna <5; coluna++){
				  texto1 += numeros[linha][coluna]+ " " ;
				  
				  
				  
			  }
			  texto1 += "\n";
			  }
				 
        
        JOptionPane.showMessageDialog(null,texto1 + "\n\n" + "\nA soma Dos Numeros Informados Na quarta linha é : " + qtlinha +
        		"\nA Soma Dos numeros Da segunda coluna é : " +sgcoluna+
        		"\nA Soma Da Diagonal Principal é : " +dp+
        		"\nA Soma Da Diagonal Secundaria é : " +ds);   
				  
				  
				  
				  
				  
				  
				  
			  }
			  
			  
			  
			  
			  
			  
			  }
			  
			  
			  
		  

