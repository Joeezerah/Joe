import javax.swing.*;

import org.omg.CORBA.NO_MEMORY;
/**
 * Ex1
 */
public class Ex1 {

public static void main(String[] args) {

    //variaveis
    
    int idade ;
    int sexo = 0 ;
    int qtger = 0 ;
    int qtatend = 0;
    int qtacoug = 0;
    int qtsecr = 0;
    int qtalmo = 0;
    int qtpad = 0;
    int qtest = 0;
    int qtmas = 0;
    int qtfem = 0;
    int qtmaior = 0;
    int qtmenor = 0;
    int qtcargo = 0;
    int qtsexo = 0;
    int qtoutro = 0;
    String nome = "";


    while (!nome.equals("sair")){
   nome =JOptionPane.showInputDialog("Informe Nome ou SAIR para cancelar");
   if (nome.equals("sair")) { break;} else  {
    sexo =Integer.parseInt(JOptionPane.showInputDialog("Digite 1 Para Masculino ou 2 para feminino"));
    if (sexo == 1) qtmas++; else {qtfem++;} 
    qtcargo =Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para gerente\n 2 para atendente\n 3 para secretario\n 4 para almoxarife\n 5 para padeiro\n 6 açougueiro\n 7 estagiario\n outro numero para outra profissao"));
   if (qtcargo == 1 ) {qtger++ ;}
   if (qtcargo == 2 ) {qtatend++;}
   if (qtcargo == 3 ) {qtsecr++;}
   if (qtcargo == 4 ) {qtalmo++;}
   if (qtcargo == 5 ) {qtpad++;}
   if (qtcargo == 6 ) {qtacoug++;}
   if (qtcargo == 7 ) {qtest++;}
   else {qtoutro++;}


    idade =Integer.parseInt(JOptionPane.showInputDialog("Informe Idade"));
    if (idade <18) qtmenor++; else {qtmaior++;}
   }



    }
    JOptionPane.showMessageDialog(null,"Quantidade de homens: " + qtmas +"\nQuantidade de mulheres: " + qtfem);
    JOptionPane.showMessageDialog(null,"Quantidade de gerentes: " + qtger +"\nQuantidade de atendente: " + qtatend + "\n Quantidade De secretarios: "+ qtsecr +"\n Quantidade de almoxarifes" + qtalmo + "\n Quantidade de Padeiros: " + qtpad + "\n Quantidade de açougueiros: "+ qtacoug +"\n Quantidade de estagiarios: " + qtest );   
     JOptionPane.showMessageDialog(null,"Quantidade de homens: " + qtmas +"\nQuantidade de mulheres: " + qtfem);
     JOptionPane.showMessageDialog(null,"Quantidade de maiores de idade: " + qtmaior +"\nQuantidade de menores de idade: " + qtmenor);

    



    }



    

    

   
    
    
    }



   



    


    
