package exercicio03;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		//Matriz
		int[][] numeros = new int [2][3];
		String texto = "";
		
		
		//Obter os numeros
		for(int linha = 0; linha < 2; linha++){
         for (int coluna =0; coluna <3; coluna++){
         numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe 6 numeros"));  
         
         }
       }

		for(int linha = 0; linha < 2; linha++){
    	   for (int coluna =0; coluna <3; coluna++){
	      texto += numeros[linha][coluna] + " ";
	      
	         
    	    
	         
	         
    	   
    	   
    	   }
    	   texto += "\n";
       }
    	   
    	   
    for (int coluna =0; coluna <3; coluna++){
		for(int linha = 0; linha < 2; linha++){
			 texto += numeros[linha][coluna] + " ";
		}
		
		texto += "\n";
		
    }
		
    	  JOptionPane.showMessageDialog(null,texto); 
    	   
    	   
    	   
    	   
    
    	   
    	   
    	   }
    	   
    	   
    	   

}
