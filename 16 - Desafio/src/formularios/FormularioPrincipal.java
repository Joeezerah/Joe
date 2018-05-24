package formularios;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import controladores.Acao;
import controladores.Produto;

public class FormularioPrincipal {

	//construtor
	public void inicializaFormulario() {
		
	
		

		//metodo  para importa açao
		Acao a = new Acao ();
		
		// JTable
		JTable tabela = new JTable(a.exibirDados());	


		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Produto : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Valor : ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Quantidade : ");
		rotulo2.setBounds(10, 60, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 40, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 60, 150, 20);
		//campo2.setBounds(x, y, width, height);

		// JButton
		JButton botao = new JButton();
		botao.setText("Cadastrar ");
		botao.setBounds(140, 90, 150, 20);


		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 115, 260, 100);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				//obter dados para os parametros de cadastro
				String produto = campo.getText();
				double valor = Double.parseDouble(campo1.getText());
				int quantidade = Integer.parseInt(campo2.getText());

				//metodo de cadastro
				a.cadastrar(produto, valor, quantidade);


				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");

				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
				campo2.requestFocus();

				tabela.setModel(a.exibirDados());

			}
             
		});

		tabela.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

				//Obter a linha 
				int linha = tabela.getSelectedRow();

				// Obter os dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());

				// Criar o novo formulário
				FormularioAlteracao f = new FormularioAlteracao(nomeProduto, valorProduto, quantidadeProduto, linha);
				

				// Fechar o FormulárioPrincipal
				formulario.dispose();



			}

			@Override
			public void mousePressed(MouseEvent e) {
				

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);
		formulario.add(barraRolagem);

		//Exibir o formulario
		formulario.setVisible(true);







	}



}


