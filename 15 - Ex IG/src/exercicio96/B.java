package exercicio96;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class B {

	public void inicializaFormulario() {

		// JFrame
		JFrame formulario = new JFrame("Formulario");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Dias que ira ficar : ");
		rotulo.setBounds(10, 20, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,60,450,20);
		combo.addItem("Ap Simples");
		combo.addItem("Ap Duplo");
		combo.addItem("Suite luxo");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int dia = Integer.parseInt(campo.getText());
				
				if (combo.getSelectedItem().equals("Ap Simples")){dia = dia*45; JOptionPane.showMessageDialog(null," A sua estadia : "+dia );}
				else if (combo.getSelectedItem().equals("Ap Duplo")){dia = dia*65; JOptionPane.showMessageDialog(null," A Sua estadia Custa : "+dia );}
				else {dia = dia*110; JOptionPane.showMessageDialog(null," A sua estadia Custa : "+dia );}
				
				//limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();
				
			};
			
		});
			
		//Adcionar componente ao JFrame
				formulario.add(rotulo);
				formulario.add(campo);
				formulario.add(combo);

				//Exibir o formulario
				formulario.setVisible(true);

			}


		}
