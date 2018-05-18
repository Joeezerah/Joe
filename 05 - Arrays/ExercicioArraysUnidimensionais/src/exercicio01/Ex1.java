package exercicio01;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		//variaveis
		double[] nr1 = new double[10];
		double[] nr2 = new double[10];
		double[] nr3 = new double [10];
		int indice = 0;
		int opcao = 0;
	
		Object[] calculos = {"Soma" , "Subtração", "Divisão", "Multiplicação"};
	
		
		
		do{
			nr1[indice] = Double.parseDouble(JOptionPane.showInputDialog("Informe 10 numeros"));
			indice++;
			
		
		}while (indice < 10);
		
	do{
		nr2[opcao] = Double.parseDouble(JOptionPane.showInputDialog("Informe mais 10 numeros"));
		opcao++;
	}while (opcao < 10);
	
	Object calculo = JOptionPane.showInputDialog(null, "Escolha a equação", "Calculos" , JOptionPane.PLAIN_MESSAGE, null, calculos, "");
	      if (calculo.equals("Soma")) {
	    	  for(int i = 0; i < 10; i++){
	    		  nr3[i] = ((nr1[i]) + (nr2[i])); }
	    	  }
	    	  else if (calculo.equals("Subtração")){
	    		  for (int a = 0; a <10; a++){
	    		       nr3 [a] = ((nr1[a]) - (nr2[a])) ;  }
	    	  }
	    	  else if (calculo.equals("Divisão")){
	    		  for (int b = 0; b <10; b++){
	    		       nr3 [b] = ((nr1[b]) / (nr2[b])) ;  }
	    	  }
	    	  else if (calculo.equals("Multiplicação")){
	    		  for (int c = 0; c <10; c++){
	    		       nr3 [c] = ((nr1[c]) * (nr2[c])) ;  }
	    	  }
	      
	      for (int d = 0; d <10; d++) {
	    	  System.out.println("O resultado é: "+nr3[d]);
	      }
	      
	    	 
	    	 
	    
	    	  
	      
	
	
	
		

 
	}

}
