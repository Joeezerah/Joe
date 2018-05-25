package exercicio94;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Nr {

	public void inicializaFormulario() {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(550, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Digite um numero : ");
		rotulo.setBounds(10, 20, 150, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(50, 50, 150, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int numero = Integer.parseInt(campo.getText());

				JOptionPane.showMessageDialog(null ,"Sucessor : " +(numero+ 1) + " Antecessor : "+ (numero- 1));

				//limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();



			};
		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);




	}

}
