import javax.swing.*;

public class Escolha {

public static void main (String [] args){
//javac Escolha.java -encoding utf8
int opcao = JOptionPane.showConfirmDialog(null, "Está gostando de java?", "", 0); 


//Estrutura de escolha switch so acc ==

switch(opcao){ 
case 0:
JOptionPane.showMessageDialog(null, "Que bom");
break;

case 1:
JOptionPane.showMessageDialog(null, "Que pena");
break;

default:
JOptionPane.showMessageDialog(null, "Bye!");
}
















}
}

