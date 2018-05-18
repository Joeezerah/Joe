package exemplo01;

public class Pessoa {
	
	//Atributo da classe
	private static int contador = 0;
	
	//construtor
	public Pessoa () {
		contador++;
		System.out.println(contador);
	}

}
