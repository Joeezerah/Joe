package exercicio9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Informe {
	public void inicializaFormulario() {
		// JFrame
		JFrame formulario = new JFrame("Formulario");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe o 1º Numero : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Informe o 2º Numero : ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Informe o 3º Numero : ");
		rotulo2.setBounds(10, 60, 450, 20);


		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 40, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 60, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Resultado");
		botao.setBounds(50, 90, 300, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (Integer.parseInt(String.valueOf(campo.getText())) < (Integer.parseInt(String.valueOf(campo1.getText()))) && (Integer.parseInt(String.valueOf(campo.getText()))) < (Integer.parseInt(String.valueOf(campo2.getText())))){
					JOptionPane.showMessageDialog (null,campo.getText());
				}else if (Integer.parseInt(String.valueOf(campo1.getText())) < (Integer.parseInt(String.valueOf(campo.getText()))) && (Integer.parseInt(String.valueOf(campo1.getText()))) < (Integer.parseInt(String.valueOf(campo2.getText())))){
					JOptionPane.showMessageDialog (null,campo1.getText());

				}else {
					JOptionPane.showMessageDialog (null,campo2.getText());
				}

				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");


				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
				campo2.requestFocus();
			};
			
		

		});
		
		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);


		
		




	}
}