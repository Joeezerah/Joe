package exercicio8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculo {

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

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 40, 150, 20);


		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,60,450,20);
		combo.addItem("soma");
		combo.addItem("subtração");
		combo.addItem("divisão");
		combo.addItem("multiplicação");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//Calcular o valor somado
				double calculoDosInfernos = Double.parseDouble(campo.getText())+Double.parseDouble(campo1.getText());


				//Calcular o valor multiplicado
				double calculoDosInfernos1 = Double.parseDouble(campo.getText())-Double.parseDouble(campo1.getText());

				//Calcular o valor somado
				double calculoDosInfernos2 = Double.parseDouble(campo.getText())*Double.parseDouble(campo1.getText());


				//Calcular o valor multiplicado
				double calculoDosInfernos3 = Double.parseDouble(campo.getText())/Double.parseDouble(campo1.getText());

				if(combo.getSelectedItem().equals("soma")) {
					JOptionPane.showMessageDialog(null, calculoDosInfernos);
				}else if (combo.getSelectedItem().equals("subtração")){
					JOptionPane.showMessageDialog(null, calculoDosInfernos1);
				}else if (combo.getSelectedItem().equals("mulplicação")) {
					JOptionPane.showMessageDialog(null, calculoDosInfernos2);
				}else {
					JOptionPane.showMessageDialog(null, calculoDosInfernos3);
				}


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
		formulario.add(combo);

		//Exibir o formulario
		formulario.setVisible(true);






	}

}
