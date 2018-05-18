package exercicio06;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		//Variaveis
		String[] gabarito = {"Sim","Não" , "Sim" , "Não" , "Sim" , "Não" , "Sim" , "Não" , "Sim" , "Não"};
		String[] nomes = new String [10];
		String [] perguntas = {"Pergunta1" , "Pergunta2" , "pergunta3" , "pergunta4" , "Pergunta5" , "Pergunta6" , "Pergunta7" , "Pergunta8" , "Pergunta9" , "Pergunta10"  };
		String[]  respostas = new String[10];
		int[] ranking = new int[10];
		int acertos = 0;
		int erro = 0;
		String nome = "";
		int qtalunos = -1;
		String erros = "";
		int maiorPontuacao = 0;
		String maiorPontuador = "";

		while((!nome.equals("Sair")) || (qtalunos == 10)){
			nome = JOptionPane.showInputDialog("Diga Seu Nome");
			qtalunos++;
			
			
			if(nome.equals("Sair")){
				break;
			}

			for (int i = 0; i <10; i++){
				respostas[i] = JOptionPane.showInputDialog(perguntas[i]);
			}

			for (int i = 0; i < respostas.length; i++) {
				if(respostas[i].equals(gabarito[i])){
					acertos++;
				} else {
					erro++;
					erros += "Pergunta: "+perguntas[i] +"\nResposta correta: "+gabarito[i] +"\n";
				}
			}
			
			JOptionPane.showMessageDialog(null,"Quantidade de acertos : " +acertos+
					"\nQuantidade De erros: " + erro+ "\nErros: " +erros);

			ranking[qtalunos] = acertos;
			nomes[qtalunos] = nome; 
			acertos = 0;
			erro = 0;
			erros = "";
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 10; j++) {
				if(ranking[j] > ranking[i]){
					maiorPontuacao = ranking[i];
					maiorPontuador = nomes[i];
					ranking[i] = ranking[j];
					nomes[i] = nomes[j];
					ranking[j] = maiorPontuacao;
					nomes[j] = maiorPontuador;
				}
			}
			
		}
		
		for (int i = 0; i < ranking.length; i++) {
			System.out.println("Nome: "+ nomes[i]+"\nPontuação: "+ranking[i]);
		}
	}
}
