package exercicio95;

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
		formulario.setSize(550, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Diga o valor do carro : ");
		rotulo.setBounds(10, 20, 150, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(200, 20, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(50, 50, 150, 20);

		//Adcionar uma açao ao botao
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Double valorveiculo = Double.parseDouble(campo.getText());
				Double valordistribuidor , valorimposto , valorisento , valorsemdistribuidor ;

				if (valorveiculo <12000){ 
					valordistribuidor = valorveiculo*0.05;
					valorsemdistribuidor = valorveiculo - valordistribuidor;
					JOptionPane.showMessageDialog(null," Valor Do Veiculo: "+ valorveiculo + "\nParte Do Distribuidor" + valordistribuidor + "\nValor Sem Distribuidor" + valorsemdistribuidor );
				}
				else if (valorveiculo <25000){
					valordistribuidor = valorveiculo*0.10;
					valorsemdistribuidor = valorveiculo - valordistribuidor;
					valorimposto = valorveiculo*0.15;
					valorisento = valorveiculo - valorimposto;
					JOptionPane.showMessageDialog(null," Valor Do veiculo: "+ valorveiculo + "\nParte Do Distribuidor" + valordistribuidor + "\nValor Sem Distribuidor" + valorsemdistribuidor + " \nValor Do imposto " + valorimposto + "\nvalor sem imposto" + valorisento);

				}
				else  {
					valordistribuidor = valorveiculo*0.15;
					valorsemdistribuidor = valorveiculo - valordistribuidor;
					valorimposto = valorveiculo*0.20;
					valorisento = valorveiculo - valorimposto;
					JOptionPane.showMessageDialog(null," Valor Do veiculo: "+ valorveiculo + "\nParte Do Distribuidor" + valordistribuidor + "\nValor Sem Distribuidor" + valorsemdistribuidor + " \nValor Do imposto " + valorimposto + "\nvalor sem imposto" + valorisento);


				}

				//limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();

			};
		});

		//Adcionar componente ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);

		//Exibir o formulario
		formulario.setVisible(true);
	}
}
