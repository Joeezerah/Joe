package ex05_JComboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

	public static void main(String[] args) {
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 90);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,10,270,30);
		combo.addItem("Naruto");
		combo.addItem("Dragon ball");
		combo.addItem("One Punch Man");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
			}


		});

		//Adicionar ao JFrame
		formulario.add(combo);

		//Exibir os componentes
		formulario.setVisible(true);


	}

}
