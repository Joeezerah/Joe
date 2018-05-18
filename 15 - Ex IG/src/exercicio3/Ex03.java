package exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex03 {

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
		rotulo.setText("Informe sua nota1 ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Informe sua nota2 ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Informe sua nota3 ");
		rotulo2.setBounds(10, 60, 450, 20);

		JLabel rotulo3 = new JLabel();
		rotulo3.setText("Informe sua nota4 ");
		rotulo3.setBounds(10, 80, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(200, 40, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(200, 60, 150, 20);

		JTextField campo3 = new JTextField();
		campo3.setBounds(200, 80, 150, 20);
		//campo2.setBounds(x, y, width, height);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui para obter a media ");
		botao.setBounds(40, 110, 400, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double calculoDosInfernos = (Double.parseDouble(campo.getText())+Double.parseDouble(campo1.getText())+Double.parseDouble(campo2.getText())+Double.parseDouble(campo3.getText()))/4;
				if (calculoDosInfernos >=7){JOptionPane.showMessageDialog(null,"Aprovado");}
				else if ((calculoDosInfernos >=5) && (calculoDosInfernos <=6.9)){JOptionPane.showMessageDialog(null,"Em recuperação");}
				else {JOptionPane.showMessageDialog(null,"Reprovado");}

				//Exibir o nome
				JOptionPane.showMessageDialog(null, "Sua media é  "+calculoDosInfernos);

				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");

				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
				campo2.requestFocus();
				campo3.requestFocus();

			}

		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(rotulo3);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);
	}

}
