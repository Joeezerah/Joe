package exercicio99;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class B {

	public void inicializaFormulario() {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("le : ");
		rotulo.setBounds(10, 20, 450, 20);

		JLabel rotulo1 = new JLabel();
		rotulo1.setText("ld : ");
		rotulo1.setBounds(10, 40, 450, 20);

		JLabel rotulo2 = new JLabel();
		rotulo2.setText("li : ");
		rotulo2.setBounds(10, 60, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		JTextField campo1 = new JTextField();
		campo1.setBounds(200, 40, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(200, 60, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(200, 90, 150, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				double le = Double.parseDouble(String.valueOf(campo.getText()));
				double ld = Double.parseDouble(String.valueOf(campo1.getText()));
				double li = Double.parseDouble(String.valueOf(campo2.getText()));

				if ((ld > (li+le)) || (le > (ld+li)) || (li > (ld+le))) {JOptionPane.showMessageDialog(null,"Não é um triângulo");}
				else if (( li == ld) && ( le == li )) {JOptionPane.showMessageDialog(null,"Triangulo equilatero");} 
				else if ((( li == ld) && ( li != le )) || (( ld == le) && (li != le)) || ((li == le ) && (li != ld))){JOptionPane.showMessageDialog(null,"Triangulo Isosceles");}
				else {JOptionPane.showMessageDialog(null,"Triangulo Escaleno");}


				//limpar o campo contendo o nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");



				//Selecionar o campo nome
				campo.requestFocus();
				campo1.requestFocus();
				campo2.requestFocus();





			};	
		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);
		

		//Exibir o formulario
		formulario.setVisible(true);




	}


}
