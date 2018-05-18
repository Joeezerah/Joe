import javax.swing.*;

public class Exercicio14{

public static void main (String [] args){

//Variaveis
Double valorveiculo , valordistribuidor , valorimposto , valorisento , valorsemdistribuidor ;

valorveiculo = Double.parseDouble(JOptionPane.showInputDialog("Valor Do Veiculo"));

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
}
}

