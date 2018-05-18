import javax.swing.*;

public class Exercicio12 {

public static void main (String[] args){

//variaveis
double velocidade;
double velocidadedv;
double diferencadv;

velocidade = Double.parseDouble(JOptionPane.showInputDialog("Indique sua velocidade"));
velocidadedv = Double.parseDouble(JOptionPane.showInputDialog("Velocidade maxima permitida"));
diferencadv = velocidade - velocidadedv;

if (velocidade <= velocidadedv) {JOptionPane.showMessageDialog(null,"Bom Motorista");}
else if (diferencadv <= 10) {JOptionPane.showMessageDialog(null,"Multa De 50 R$");}
else if (diferencadv <= 30) {JOptionPane.showMessageDialog(null,"Multa De 100 R$");}
else {JOptionPane.showMessageDialog(null,"Multa De 200 R$");}

}
}