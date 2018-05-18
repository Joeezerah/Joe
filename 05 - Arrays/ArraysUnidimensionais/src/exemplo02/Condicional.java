package exemplo02;

public class Condicional {

	public static void main(String[] args) {
		
		//Array de inteiros
		int [] idades = {5, 12, 18, 7, 23, 30, 40, 6};
		
		//verificar se o candidato pode tirar a CNH
		/*for(int idade : idades){
			System.out.println(idade);
		if(idade >=18){
			System.out.println(idade +" esta aprovado ");
			}else{
				System.out.println(idade +" esta reprovado ");
			}
		}*/
		//Operador ternario
		for (int idade : idades){
		System.out.println(idade+ " "+(idade >=18 ? "aprovado" : "reprovado"));
		}
		
		
		

	}

}
