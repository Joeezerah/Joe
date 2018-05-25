package exercicio93;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Motorista {

	public void inicializaFormulario() {

		// JFrame
		JFrame formulario = new JFrame("Formulario");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Velocidade do veiculo : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Velocidade permitida : ");
		rotulo1.setBounds(10, 40, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 40, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Resultado");
		botao.setBounds(50, 90, 300, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				double velocidade = Double.parseDouble(campo.getText());
				double velocidadedv = Double.parseDouble(campo1.getText());
				double diferencadv =  velocidadedv - velocidade;

				if (velocidadedv <= velocidade) {JOptionPane.showMessageDialog(null,"Bom Motorista");}
				else if (diferencadv <= 10) {JOptionPane.showMessageDialog(null,"Multa De 50 R$");}
				else if (diferencadv <= 30) {JOptionPane.showMessageDialog(null,"Multa De 100 R$");}
				else {JOptionPane.showMessageDialog(null,"Multa De 200 R$");}

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
