import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		//Variaveis
		String palavra;
		String novaPalavra = " ";
		
      palavra = JOptionPane.showInputDialog("Insira a palavra");
      palavra = palavra.toLowerCase();
      
      for (int i = 0; i < palavra.length(); i++) {
		
    	  if(i % 2 == 0) {
    		  novaPalavra += palavra.toUpperCase().charAt(i);
    		  
    	  }else {
    		  novaPalavra += palavra.charAt(i);
    	  }
	}
		
      JOptionPane.showMessageDialog(null, novaPalavra);
		
		
	}

}
