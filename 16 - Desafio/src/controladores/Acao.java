package controladores;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;

public class Acao {

	Produto p = new Produto();
	FormularioPrincipal fp = new FormularioPrincipal();




	public void cadastrar(String campo , double campo2 ,int campo1  ) {
		Produto p = new Produto();
		p.produto = campo;
		p.quantidade = campo1;
		p.valor = campo2;
		Produto.dados.add(p);

		System.out.println(Produto.dados.size());

	}

	public DefaultTableModel exibirDados() {
		DefaultTableModel exibirDados = new DefaultTableModel();

		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");

		for (int i = 0; i < Produto.dados.size(); i++) {
			exibirDados.addRow(new Object[] {Produto.dados.get(i).produto ,Produto.dados.get(i).valor ,Produto.dados.get(i).quantidade});

		}

		return exibirDados;
	}

	// Método para excluir
	public void excluir(int linha) {
		Produto.dados.remove(linha);
	}

	// Método para alterar
	public void alterar(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {

		// Criar objeto

		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		p.setQuantidadeProduto(quantidadeProduto);

		// Realizar a alteração
		Produto.dados.set(linha, p);

	}


}


