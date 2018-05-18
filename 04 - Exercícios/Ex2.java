/**
 * Ex2
 */
import javax.swing.*;

public class Ex2 {

public static void main(String[] args) {
    
//variaveis
double alturatotal =0;
double altura =0;
double peso =0;
int idade =0;
int qtjog = 0 ;
String nome = "";
String maiornome ="";
double maioraltura =0;
double maioridade =0;
String jogadorvelho="";
double maiorpeso =0;
String jogadorpesado ="";

    while (!nome.equals("sair")){
    nome =JOptionPane.showInputDialog("Informe Nome ou SAIR para cancelar");
    if (nome.equals("sair")) { break;} else  {
    qtjog++;
    altura =Double.parseDouble(JOptionPane.showInputDialog("Informe Altura"));
    alturatotal = alturatotal + altura ;
    if (altura > maioraltura){maioraltura=altura; maiornome = nome; }
    idade =Integer.parseInt(JOptionPane.showInputDialog("Informe Idade"));
    if (idade > maioridade){maioridade = idade; jogadorvelho = nome;}
    peso =Double.parseDouble(JOptionPane.showInputDialog("Informe Peso"));
    if (peso > maiorpeso){maiorpeso=peso; jogadorpesado = nome; }
    


    








}
    }
    alturatotal = alturatotal/qtjog;
    JOptionPane.showMessageDialog(null," Quantidade de jogadores " +qtjog);
    JOptionPane.showMessageDialog(null," Maior Altura\n " + maioraltura + " Nome Do Jogador " +maiornome);
    JOptionPane.showMessageDialog(null," Maior Idade\n " + maioridade  + " Nome Do Jogador " +jogadorvelho);
    JOptionPane.showMessageDialog(null," Maior Peso\n " + maiorpeso  + " Nome Do Jogador " +jogadorpesado);
    JOptionPane.showMessageDialog(null," Media das alturas "+alturatotal);

}   
}
