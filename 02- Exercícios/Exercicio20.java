import javax.swing.*;

public class Exercicio20 {

public static void main (String[] args){

Object[] estados = {"S�o Paulo" , "Rio De Janeiro", "Santa Catarina"};
Object[] cidadesp = {"Osasco" , "S�o Paulo", "S�o Caetano"};
Object[] cidadesrj = {"Rio De Janeiro" , "Angra Dos Reis", "Teres�polis"};
Object[] cidadesc = {"Blumenau" , "Pomerode", "Gaspar"};

 Object estado = JOptionPane.showInputDialog(null, "Escolha seu Estado", "Estados" , JOptionPane.PLAIN_MESSAGE, null, estados, "");

if(estado.equals("S�o Paulo")){
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesp, "");
	if (cidade.equals("S�o Paulo")){
		JOptionPane.showMessageDialog(null,"Popula��o = 12 milh�es");
	} else if (cidade.equals("Osasco")){
		JOptionPane.showMessageDialog(null,"Popula��o = 700 mil");}
          else  {JOptionPane.showMessageDialog(null,"Popula��o = 150 mil");}
}
else if(estado.equals("Rio De Janeiro")){
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesrj, "");
	if (cidade.equals("Rio De Janeiro")){
		JOptionPane.showMessageDialog(null,"Popula��o = 6.5 milh�es");
	} else if (cidade.equals("Angra Dos Reis")){
		JOptionPane.showMessageDialog(null,"Popula��o = 194 mil");}
          else  {JOptionPane.showMessageDialog(null,"Popula��o = 176 mil");}
}
else{
Object cidade = JOptionPane.showInputDialog(null, "Escolha sua cidade", "Cidades" , JOptionPane.PLAIN_MESSAGE, null, cidadesc, "");
	if (cidade.equals("Blumenau")){
		JOptionPane.showMessageDialog(null,"Popula��o = 334 mil");
	} else if (cidade.equals("Pomerode")){
		JOptionPane.showMessageDialog(null,"Popula��o = 25 mil");}
          else  {JOptionPane.showMessageDialog(null,"Popula��o = 66 mil");}
}


}

}