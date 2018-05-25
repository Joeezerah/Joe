package exercicio991;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class B {

	public void inicializaFormulario() {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe a velocidade ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Informe o tempo ");
		rotulo1.setBounds(10, 40, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(200, 40, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(200, 90, 150, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, Double.parseDouble(String.valueOf(campo.getText())) / (Double.parseDouble(String.valueOf(campo1.getText())))+ "m/s");

				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");


				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
			};
		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(botao);


		//Exibir o formulario
		formulario.setVisible(true);

	}

}
