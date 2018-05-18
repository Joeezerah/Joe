package exercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex04 {

	public static void main(String[] args) {
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe nome do produto ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Informe valor do produto ");
		rotulo1.setBounds(10, 40, 450, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,60,450,20);
		combo.addItem("a vista");
		combo.addItem("a prazo");
		combo.addItem("cartao");

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

				//Exibir o nome
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				double calculoDosInfernos =0;
				if ((String.valueOf(combo.getSelectedItem()).equals("a vista")) && (Double.parseDouble(campo1.getText())>500)) {
					calculoDosInfernos = Double.parseDouble(campo1.getText())*0.9;
				}else {
					calculoDosInfernos = Double.parseDouble(campo1.getText())*1;
				}
				if ((String.valueOf(combo.getSelectedItem()).equals("a prazo")) && (Double.parseDouble(campo1.getText())>500)) {
					calculoDosInfernos = Double.parseDouble(campo1.getText())*1;
				}
				if ((String.valueOf(combo.getSelectedItem()).equals("cartao")) && (Double.parseDouble(campo1.getText())>500)) {
					calculoDosInfernos = Double.parseDouble(campo1.getText())*1;
				}
					

				JOptionPane.showMessageDialog(null, "Valor a pagar  "+calculoDosInfernos );	

				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");


				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();


			}

		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(botao);
		formulario.add(combo);

		//Exibir o formulario
		formulario.setVisible(true);




	}

}
