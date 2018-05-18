import javax.swing.*;
/**
 * Ex3
 */

 class Ex3 {

    public static void main(String[] args) {
   
        //variaveis
        int codigo =-1;
        double troco =0;
        double valor =0 ;
        int quantidade = -1;
        double dinheiro=0;
        double total =0;

    while(codigo != 0){
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null ,"Informe o Codigo do produto\n Digite 0 Para Sair"));
if (codigo==0){break;}
     if (codigo == 1){valor = 5.00;}
     else if (codigo == 2){valor = 4.50;}
     else if (codigo == 3){valor = 8.00;}
     else if (codigo == 4){valor = 12.00;}
     else if (codigo == 5){valor = 16.50;}
     else if (codigo == 6){valor = 1.00;}
     else {valor = 2.50;}
     while (quantidade <=0){
     quantidade = Integer.parseInt(JOptionPane.showInputDialog(null ,"Informe a quantidade de produtos"));} 


valor = valor*quantidade;
while (dinheiro < valor){
dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o Dinheiro cliente"));}

troco = dinheiro - valor;

JOptionPane.showMessageDialog(null,"Troco: "+troco);
    }
   
    }

    
}
