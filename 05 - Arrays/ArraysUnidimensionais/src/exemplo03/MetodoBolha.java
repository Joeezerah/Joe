package exemplo03;

public class MetodoBolha {

	public static void main(String[] args) {
		
		//Maior Numero
		int maiorNumero;
		
		//vetor
		int [] numeros = {5, 3, 1 , 8, 4};
		
		//la�o 01 sempre para 1 posi�ao antes .
		for(int i1 =0; i1 <4; i1++){
			//la�o 02
			for (int i2 = i1+1; i2 < 5 ; i2++){
				
				if (numeros[i2] < numeros [i1]){
					maiorNumero = numeros [i1];
					numeros[i1] = numeros [i2];
					numeros [i2] = maiorNumero;
				}
				
			}
		}
		
		//Exibir Vetor
		for (int n : numeros){
			System.out.println(n);
		}
	}

}
