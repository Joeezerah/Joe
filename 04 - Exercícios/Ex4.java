import javax.swing.*;
/**
 * Ex4
 */
public class Ex4 {
public static void main(String[] args) {
  
    //variaveis

    
    int idade = 0;
    double voto = 0;
    Object[] opcoes = {"excelente" , "otimo", "bom", "regular", "ruim" , "sair"};
    Object[] qtpess = {"criancas 0 a 9 anos" , "adolescente 10 a 17", "adulto acima de 17"};
    double excelente = 0;
    double otimo = 0;
    double bom = 0;
    double regular = 0;
    double ruim = 0;
    double criancas = 0;
    double adolescente = 0;
    double adulto = 0;
    boolean executar = true;

    
    while(executar != false){
        Object opcoe = JOptionPane.showInputDialog(null, "Vote aqui", "Votacao" , JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
       if (opcoe.equals ("sair")) {break;} else { voto++ ;}
       if (opcoe.equals ("excelente"))  {excelente++;}
       if (opcoe.equals ("otimo")) {otimo++;}
       if (opcoe.equals ("bom")) {bom++;}
       if (opcoe.equals ("regular")) {regular++;}
       if (opcoe.equals ("ruim")) {ruim++;}
       Object opco = JOptionPane.showInputDialog(null, "Selecione sua idade", "Idade" , JOptionPane.PLAIN_MESSAGE, null, qtpess, "");
       if (opco.equals("criancas 0 a 9 anos")) {criancas++;}
       if (opco.equals("Adolescente 10 a 17 anos")) {adolescente++;}
       if (opco.equals("Adulto acima de 17") ) {adulto++;}

       

     } 

     excelente = (excelente/voto)*100;
     otimo = (otimo/voto)*100;
     bom = (bom/voto)*100;
     regular = (regular/voto)*100;
     ruim = (ruim/voto)*100;

    JOptionPane.showMessageDialog(null," excelente : % " +excelente);
    JOptionPane.showMessageDialog(null," otimo : % " +otimo);
    JOptionPane.showMessageDialog(null," bom : % " +bom);
    JOptionPane.showMessageDialog(null," regular : % " +regular);
    JOptionPane.showMessageDialog(null," ruim : % " +ruim);
    JOptionPane.showMessageDialog(null," criancas : " +criancas);
    JOptionPane.showMessageDialog(null," adolescente : " +adolescente);
    JOptionPane.showMessageDialog(null," adulto : " +adulto);
    
     



    
    
    


    
    
}
    
}
    
