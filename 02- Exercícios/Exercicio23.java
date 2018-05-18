import javax.swing.*;

public class Exercicio23 {

public static void main (String [] args){

//variaveis
double altura , peso , imc ;

altura =Double.parseDouble(JOptionPane.showInputDialog("Diga Sua Altura"));
peso =Double.parseDouble(JOptionPane.showInputDialog("Diga Seu Peso"));

imc = peso/(altura*altura);

if (imc < 17){JOptionPane.showMessageDialog(null,"Muito Abaixo Do Peso "+ imc);}
else if (imc <= 18.49){JOptionPane.showMessageDialog(null,"Abaixo Do Peso "+ imc);}
else if (imc <= 24.99){JOptionPane.showMessageDialog(null,"Peso Normal "+ imc);}
else if (imc <= 29.99){JOptionPane.showMessageDialog(null,"Acima Do Peso "+ imc);}
else if (imc <= 34.99){JOptionPane.showMessageDialog(null,"Obesidade 1 " + imc);}
else if (imc < 39.99){JOptionPane.showMessageDialog(null,"Obesidade 2 " + imc);}
else {JOptionPane.showMessageDialog(null,"Obesidade 3 " + imc);}


}
}






















