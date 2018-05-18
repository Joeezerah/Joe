import javax.swing.*;

public class Enquanto2{

public static void main (String [] args){

//obter um numero inteiro
int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));

//Estrutura da tabuada

String tabuada = "A tabuada de "+numero+" é:\n";

//Indice
int indice = 0;

//laço
while(indice <= 10){
tabuada += numero+" X "+indice+" = "+(numero*indice)+"\n";

indice++;
}

//Exibir a tabuada
JOptionPane.showMessageDialog(null, tabuada); 



















}
}