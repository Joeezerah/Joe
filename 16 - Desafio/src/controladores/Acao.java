package controladores;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;

public class Acao {

     Produto p = new Produto();
     FormularioPrincipal fp = new FormularioPrincipal();
     

     
     
	public void cadastrar(String campo , double campo1 , int campo2) {
		p.produto = campo;
		p.quantidade = campo1;
		p.valor = campo2;
		Produto.dados.add(p);
		
		System.out.println(Produto.dados.size());
	
	}

	public JTable exibirDados() {
		DefaultTableModel exibirDados = new DefaultTableModel();
		
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Quantidade");
		exibirDados.addColumn("Valor");
		
		for (int i = 0; i < Produto.dados.size(); i++) {
			exibirDados.addRow(new Object[] {Produto.dados.get(i).produto ,Produto.dados.get(i).quantidade ,Produto.dados.get(i).valor});
			
		}
		
		JTable tabela = new JTable(exibirDados);
		
		return tabela;
		
	}


}


