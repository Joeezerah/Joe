package exemplo01;

public class Array {

	public static void main(String[] args) {
		
		//vetor/array = variavel que armazena multiplos dados
		String[] nomes = new String [3];
		
		//adicionar dados ao vetor
		nomes[0] = "Alice";
		nomes[1] = "Bryan";
		nomes[2] = "Caroline";
		
		//Exibir valores do vetor #1
		//System.out.println(nomes[0]);
		//System.out.println(nomes[1]);
		//System.out.println(nomes[2]);
		
		//exibir valores do vetor #2
		/*int indice =0;
		do{
			System.out.println(nomes[indice]);	
		    indice++;
		}while(indice <3);*/
		
		//Exibir valores do vetor #3
		/*for(int indice = 0; indice < 3; indice++){
			System.out.println((indice+1)+" º nome é " +nomes[indice]);
		}*/
		
		//Exibir valores do vetor #4
		for (String nome : nomes){
			System.out.println(nome);
			
		}

	}

}
