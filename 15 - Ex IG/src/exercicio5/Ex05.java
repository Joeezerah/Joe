package exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex05 {

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
		rotulo.setText("Informe o dia do mes ");
		rotulo.setBounds(10, 20, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui para ver se e dia de semana ou nao");
		botao.setBounds(50, 90, 300, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				//Exibir o dia que e da semana
				if ((Integer.parseInt(String.valueOf(campo.getText())) <= 0) || (Integer.parseInt(String.valueOf(campo.getText())) >=29)) {
					JOptionPane.showMessageDialog(null,"Data inválida");
				}else if ((Integer.parseInt(String.valueOf(campo.getText())) == 3) || (Integer.parseInt(String.valueOf(campo.getText())) == 4)
						|| (Integer.parseInt(String.valueOf(campo.getText())) == 10) || (Integer.parseInt(String.valueOf(campo.getText())) == 11) ||
						(Integer.parseInt(String.valueOf(campo.getText())) == 17) || (Integer.parseInt(String.valueOf(campo.getText())) == 18) ||
						(Integer.parseInt(String.valueOf(campo.getText())) == 24) ||  (Integer.parseInt(String.valueOf(campo.getText())) == 25) ){
					JOptionPane.showMessageDialog(null,"Fim de semana");}
				else
				{JOptionPane.showMessageDialog(null,"Dia de semana");}






				JOptionPane.showMessageDialog(null, "O dia que voce informou é : "+campo.getText());

				//limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();

			}

		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);

	}

}
