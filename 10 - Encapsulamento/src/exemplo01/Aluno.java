package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {
	
	/*
	 * Encapsulento ->  Visibilidade de atributos e métodos
	 * Default -> Visivel apenas nas classes no mesmo pacote
	 * Public -> Visivel por qualquer classe (Em qualquer projeto)
	 * Private -> Visivel apenas na classe onde sao criados
	 * Protected -> Visivel na classe onde são criados ou herdados
	 */
	
	//Atributos da classe
	private String nome;
	private double nota1 , nota2;
	
	//Metodo para obter osdados
	public void obterDados() {
	nome =JOptionPane.showInputDialog("Nome");
	nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1 "));
	nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2 "));
	
	exibirFrase();
	
	}
	//metodo para retornar a media
	private double calculoMedia() {
		return (nota1+nota2) /2 ;
	}
	//metodo para exibir uma frase
	private void exibirFrase() {
		JOptionPane.showMessageDialog(null, nome+ " obteve média: " +calculoMedia());
	}

}
