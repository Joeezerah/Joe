package exercicio92;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Escola {

	public void inicializaFormulario() {

		// JFrame
		JFrame formulario = new JFrame("Numero igual soma senão multiplica");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("nota1 : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("nota2 : ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("nota3 : ");
		rotulo2.setBounds(10, 60, 450, 20);

		JLabel rotulo3 = new JLabel();
		rotulo3.setText("nota4 : ");
		rotulo3.setBounds(10, 80, 450, 20);	

		JLabel rotulo4 = new JLabel();
		rotulo4.setText("Faltas : ");
		rotulo4.setBounds(10, 100, 450, 20);

		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 40, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 60, 150, 20);

		JTextField campo3 = new JTextField();
		campo3.setBounds(140, 80, 150, 20);

		JTextField campo4 = new JTextField();
		campo4.setBounds(140, 100, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Resultado");
		botao.setBounds(50, 140, 300, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				double nota1 = Double.parseDouble(campo.getText());
				double nota2 = Double.parseDouble(campo1.getText());
				double nota3 = Double.parseDouble(campo2.getText());
				double nota4 = Double.parseDouble(campo3.getText());
				double faltas = Double.parseDouble(campo4.getText());
				double media = (nota1 + nota2 + nota3 + nota4) /4;

				if ((media == 10) && (faltas <15)){JOptionPane.showMessageDialog(null,"Sua Média é : " + media + " Parabéns");}
				else if ((media >=9) && (faltas <15)) {JOptionPane.showMessageDialog(null,"Sua Média é : " +media+  " Ótimo");}
				else if ((media >=7) && (faltas <15)) {JOptionPane.showMessageDialog(null,"Sua Média é : " +media+  " Bom");}
				else if ((media >=5.1) && (faltas <15)) {JOptionPane.showMessageDialog(null,"Sua Média é : " +media+ " Em Exame");}
				else {JOptionPane.showMessageDialog(null,"Reprovado");}
				
				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				campo4.setText("");

				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
				campo2.requestFocus();
				campo3.requestFocus();
				campo4.requestFocus();
				



			};

		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(rotulo3);
		formulario.add(rotulo4);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		formulario.add(campo4);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);

	}

}
