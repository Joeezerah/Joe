package exercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tabuada {

	public void inicializaFormulario() {

		// JFrame
		JFrame formulario = new JFrame("Formulario");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe  1 Numero : ");
		rotulo.setBounds(10, 20, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Resultado");
		botao.setBounds(50, 90, 300, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				//Exibir o nome
				JOptionPane.showMessageDialog(null, "Resultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por zero : " + (Integer.parseInt(campo.getText())) *0 
						+"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por um : " + (Integer.parseInt(campo.getText())) *1 + 
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por dois : " + (Integer.parseInt(campo.getText())) *2 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por tres : " + (Integer.parseInt(campo.getText())) *3 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por quatro : " + (Integer.parseInt(campo.getText())) *4 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por cinco : " + (Integer.parseInt(campo.getText())) *5 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por seis : " + (Integer.parseInt(campo.getText())) *6 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por sete : " + (Integer.parseInt(campo.getText())) *7 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por oito : " + (Integer.parseInt(campo.getText())) *8 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por nove : " + (Integer.parseInt(campo.getText())) *9 + 
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por dez : " + (Integer.parseInt(campo.getText())) *10);	

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

