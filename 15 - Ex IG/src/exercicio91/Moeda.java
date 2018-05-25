package exercicio91;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Moeda {

	public void inicializaFormulario() {

		// JFrame
		JFrame formulario = new JFrame("Formulario");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("01 centavos : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("05 centavos : ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("10 centavos : ");
		rotulo2.setBounds(10, 60, 450, 20);

		JLabel rotulo3 = new JLabel();
		rotulo3.setText("25 centavos : ");
		rotulo3.setBounds(10, 80, 450, 20);	

		JLabel rotulo4 = new JLabel();
		rotulo4.setText("50 centavos : ");
		rotulo4.setBounds(10, 100, 450, 20);

		JLabel rotulo5 = new JLabel();
		rotulo5.setText("1 real : ");
		rotulo5.setBounds(10, 120, 450, 20);

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

		JTextField campo5 = new JTextField();
		campo5.setBounds(140, 120, 150, 20);

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
				double nota5 = Double.parseDouble(campo4.getText());
				double nota6 = Double.parseDouble(campo5.getText());
				
				nota1 = nota1 * 0.01 ;
				nota2 = nota2 * 0.05 ;
				nota3 = nota3 * 0.10 ;
				nota4 = nota4 * 0.25 ;
				nota5 = nota5 * 0.50 ;
				nota6 = nota6 * 1 ;
				
				double total = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
				
				DecimalFormat df = new DecimalFormat("0.##");
				String novoTotal = df.format(total);
				
				JOptionPane.showMessageDialog(null, novoTotal);
				
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
				formulario.add(rotulo2);
				formulario.add(rotulo3);
				formulario.add(rotulo4);
				formulario.add(rotulo5);
				formulario.add(campo);
				formulario.add(campo1);
				formulario.add(campo2);
				formulario.add(campo3);
				formulario.add(campo4);
				formulario.add(campo5);
				formulario.add(botao);

				//Exibir o formulario
				formulario.setVisible(true);

		}
}
