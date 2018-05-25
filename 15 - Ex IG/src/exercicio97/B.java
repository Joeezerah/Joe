package exercicio97;

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
		rotulo.setText("Valor pago : ");
		rotulo.setBounds(10, 20, 450, 20);

		//Instanciar JTextField
		JTextField campo = new JTextField();
		campo.setBounds(140, 20, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10,60,450,20);
		combo.addItem("Hamburguer + suco de laranja");
		combo.addItem("Sanduiche natural + Suco de uva");
		combo.addItem("Prato do Dia");
		combo.addItem("Pizza");
		combo.addItem("Lasanha");
		combo.addItem("Pão de queijo");
		combo.addItem("Bolo");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int pedido1 ;
				double troco ;
				double dinheiro = Double.parseDouble(campo.getText());

				if (combo.getSelectedItem().equals ("Hamburguer + suco de laranja")) {
					troco = dinheiro - 5;
					pedido1 = 1; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 5 R$ ");}
				else if (combo.getSelectedItem().equals ("Sanduiche natural + Suco de uva")) {
					troco = dinheiro - 4.50;
					pedido1 = 2; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 4.50 R$ ");}
				else if (combo.getSelectedItem().equals ("Prato do Dia")) {
					troco = dinheiro - 8;
					pedido1 = 3; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 8 R$ ");}
				else if (combo.getSelectedItem().equals ("Pizza")) {
					troco = dinheiro - 12;
					pedido1 = 4; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 12 R$ ");}
				else if (combo.getSelectedItem().equals ("Lasanha")) {
					troco = dinheiro - 16.50;
					pedido1 = 5; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 16.50 R$ ");}
				else if (combo.getSelectedItem().equals ("Pão de queijo")) {
					troco = dinheiro - 1.00;
					pedido1 = 6; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 1.00 R$ ");}
				else  {
					troco = dinheiro - 2.50;
					pedido1 = 7; 
					JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 2.50 R$ ");}


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
