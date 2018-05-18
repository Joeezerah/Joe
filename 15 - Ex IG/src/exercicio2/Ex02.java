package exercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex02 {

	public static void main(String[] args) {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(550, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe o preço do seu produto : ");
		rotulo.setBounds(10, 20, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui para ver o seu produto com 10% de desconto");
		botao.setBounds(50, 90, 550, 20);
		
		//Adcionar uma açao ao botao
				botao.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						
						//Calcular o valor
						double calculoDosInfernos = Double.parseDouble(campo.getText())*0.9;
						campo.setText(String.valueOf(calculoDosInfernos));
						
						//Exibir o produto
						JOptionPane.showMessageDialog(null, "O preço do produto fica :  "+campo.getText());	

						//limpar o campo contendo o nome
						campo.setText("");

						//Selecionar o campo nome
						campo.requestFocus();

					}

				});
				
				//Adcionar componente ao JFrame
				formulario.add(rotulo);
				formulario.add(campo);
				formulario.add(botao);

				//Exibir o formulario
				formulario.setVisible(true);


	}

}
