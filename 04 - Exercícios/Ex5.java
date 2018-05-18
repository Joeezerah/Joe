import javax.swing.*;

/**
 * Ex5
 */
public class Ex5 {

 public static void main(String[] args) {
    
    //variaveis
    String produto = "";
    double valor = 0;

    while (!produto.equals("sair")){
        produto = JOptionPane.showInputDialog(null, "Informe o Produto , Ou digite sair para encerrar o programa");
        if (produto.equals("sair")){break;}
        valor = Double.parseDouble( JOptionPane.showInputDialog(null, "Informe O valor"));
        JOptionPane.showMessageDialog(null,"\nProduto : "+produto+ "\nValor : "+valor+ "\n1 x "+(valor*0.95)+" = "+(1*(valor*0.95))
        +"\n2 x "+(valor*0.90)+" = "+(2*(valor*0.90))+"\n3 x "+(valor*0.85)+ " = " +(3*(valor*0.85))
        +"\n4 x "+(valor*0.80)+" = "+(4*(valor*0.80))+ "\n5 x "+(valor*0.75)+ " = " + (5*(valor*0.75))
        +"\n6 x "+(valor*0.70)+" = "+(6*(valor*0.70))+ "\n7 x "+(valor*0.65)+ " = " + (7*(valor*0.65))
        +"\n8 x "+(valor*0.60)+" = "+(8*(valor*0.60))+ "\n9 x "+(valor*0.55)+ " = " + (9*(valor*0.55))
        +"\n10 x "+(valor*0.50)+" = "+(10*(valor*0.50)));
        

        

    }
    









 }   
}