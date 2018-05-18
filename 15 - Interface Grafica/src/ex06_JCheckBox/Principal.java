package ex06_JCheckBox;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

	public static void main(String[] args) {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 150);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		// JCheckBox
		JCheckBox cbxMasculino = new JCheckBox ("Masculino");
		cbxMasculino.setBounds(10,10,100,20);


		JCheckBox cbxFeminino = new JCheckBox("Feminino");
		cbxFeminino.setBounds(110,10,100,20);

		//JButton
		JButton botao = new JButton ("Clique Aqui");
		botao.setBounds(40, 50, 150, 20);

		//Açao
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbxMasculino.isSelected() && (cbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estao selecionados");
				}else if (cbxMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino Selecionado");
				}else if (cbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino Selecionado");
				}else {
					JOptionPane.showMessageDialog(null, "Nenhum Selecionado");
				}
			}


			});

		//Adcionar componentes ao JFrame
		formulario.add(cbxMasculino);
		formulario.add(cbxFeminino);
		formulario.add(botao);

		//Exibir Toda a estrutura
		formulario.setVisible(true);

	}
}


