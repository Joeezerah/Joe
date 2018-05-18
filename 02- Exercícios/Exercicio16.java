import javax.swing.*;

public class Exercicio16{

public static void main (String[] args){

//variaveis
double troco ,dinheiro;
Object[] pedidos = {"Hamburguer + suco de laranja" , "Sanduiche natural + Suco de uva" , "Prato do Dia" , "Pizza" , "Lasanha" , "Pão de queijo" , "Bolo"};
int pedido1;

dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Valor"));

Object pedido = JOptionPane.showInputDialog(null,"Escolha Seu pedido" , "Menu" , JOptionPane.PLAIN_MESSAGE, null, pedidos, "");

if (pedido.equals ("Hamburguer + suco de laranja")) {
	troco = dinheiro - 5;
	pedido1 = 1; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 5 R$ ");}
else if (pedido.equals ("Sanduiche natural + Suco de uva")) {
	troco = dinheiro - 4.50;
	pedido1 = 2; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 4.50 R$ ");}
else if (pedido.equals ("Prato do Dia")) {
	troco = dinheiro - 8;
	pedido1 = 3; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 8 R$ ");}
else if (pedido.equals ("Pizza")) {
	troco = dinheiro - 12;
	pedido1 = 4; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 12 R$ ");}
else if (pedido.equals ("Lasanha")) {
	troco = dinheiro - 16.50;
	pedido1 = 5; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 16.50 R$ ");}
else if (pedido.equals ("Pão de queijo")) {;
	troco = dinheiro - 1.00;
	pedido1 = 6; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 1.00 R$ ");}
else  {
	troco = dinheiro - 2.50;
	pedido1 = 7; 
	JOptionPane.showMessageDialog(null, "Troco:" + troco + " Numero do pedido  " + pedido1 + " Valor do pedido 2.50 R$ ");}

}
}