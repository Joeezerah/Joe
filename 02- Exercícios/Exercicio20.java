import javax.swing.*;

public class Exercicio20 {

public static void main (String[] args){

Object[] estados = {"São Paulo" , "Rio De Janeiro", "Santa Catarina"};
Object[] cidadesp = {"Osasco" , "São Paulo", "São Caetano"};
Object[] cidadesrj = {"Rio De Janeiro" , "Angra Dos Reis", "Teresópolis"};
Object[] cidadesc = {"Blumenau" , "Pomerode", "Gaspar"};

 Object estado = JOptionPane.showInputDialog(null, "Escolha seu Estado", "Estados" , JOptionPane.PLAIN_MESSAGE, null, estados, "");

if(estado.equals("São Paulo")){
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesp, "");
	if (cidade.equals("São Paulo")){
		JOptionPane.showMessageDialog(null,"População = 12 milhões");
	} else if (cidade.equals("Osasco")){
		JOptionPane.showMessageDialog(null,"População = 700 mil");}
          else  {JOptionPane.showMessageDialog(null,"População = 150 mil");}
}
else if(estado.equals("Rio De Janeiro")){
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesrj, "");
	if (cidade.equals("Rio De Janeiro")){
		JOptionPane.showMessageDialog(null,"População = 6.5 milhões");
	} else if (cidade.equals("Angra Dos Reis")){
		JOptionPane.showMessageDialog(null,"População = 194 mil");}
          else  {JOptionPane.showMessageDialog(null,"População = 176 mil");}
}
else{
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesc, "");
	if (cidade.equals("Blumenau")){
		JOptionPane.showMessageDialog(null,"População = 334 mil");
	} else if (cidade.equals("Pomerode")){
		JOptionPane.showMessageDialog(null,"População = 25 mil");}
          else  {JOptionPane.showMessageDialog(null,"População = 66 mil");}
}


}

}