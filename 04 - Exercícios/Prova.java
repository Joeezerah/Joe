//importaçao
import javax.swing.*;

//classe
public class Prova {
    //inicializacao
    public static void main(String[] args) {
        
        //variaveis
       String nome = " " ;
       int qtpe = 0 ;
       boolean valido = false;
       int cargo1 = 0;
       int cargo2 = 0;
       int cargo3 = 0;
       int cargo4 = 0;
       int cargo5 = 0;
       int cargo6 = 0;
       int cargo7 = 0;
       int cargo8 = 0;
       int cargo9 = 0;
       int cargo = 0;
       int hr1 = 0;
       int hr2 = 0;
       int n1 =0;
       double hrextra ;
       double hrextra1 ;
       int sexmas = 0;
       int sexfem = 0;
       int idade ;
       int falta ;
       int qtfilhos ;
       int djj = 0;
       int djp = 0;
       int djs = 0;
       int abd = 0;
       int aj = 0;
       int ap = 0;
       int as = 0;
       int ats = 0;
       int gp = 0;
       int cf = 0;
       int sexo = 0;
       int salariob ;
       int cf1 = 0;
       int i18 = 0;
       int i19 = 0;
       int i20 = 0;
       int i21 = 0;
       


       


    //laço
    while(!nome.equals("sair")){
        nome = "";
        do{ 
        try{ 
            while (nome.isEmpty()) {
                nome = JOptionPane.showInputDialog("Informe seu nome ou digite sair fechar o programa");
                valido = true;  
            }
              
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro.");
                nome = "";
                valido = false; 
            }
        }while(valido == false);
              if (nome.equals("sair")){
                  break;
                } else { 
                    qtpe++;
                }
                valido = false;
      
        do{
          try {
              valido = true;
              cargo = Integer.parseInt(JOptionPane.showInputDialog("Informe Seu Cargo Digitando 1 para Desenvolvedor Java Júnior\n 2 para Desenvolvedor Java Pleno\n 3 para Desenvolvedor Java Sênior\n 4 para Administrador de Banco de Dados\n 5 para Analista Júnior\n 6 para Analista Pleno\n 7 para Analista Sênior\n 8 para Arquiteto de Software\n e 9 para Gerente de Projetos "));      
             } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro.");
             valido = false;
         }while ((n1<0) || (n1>10));

        }while(valido == false);
     

             
             if (cargo == 1) cargo1++; else if (cargo == 2) cargo2++;
            else if (cargo == 3) cargo3++; else if (cargo == 4) cargo4++;
            else if (cargo == 5) cargo5++; else if (cargo == 6) cargo6++;
            else if (cargo == 7) cargo7++; else if (cargo == 8) cargo8++;
            else {cargo9++;}
  
            hrextra = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas extras com acrescimo de 50%"));
            hrextra = hr1*1.5;
            hrextra1 = Double.parseDouble(JOptionPane.showInputDialog("Informe quantas horas extras com acrescimo de 100%"));
            hrextra1 = hr2*2.0;

            do{
                try {
                  valido = true;
                  sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para masculino e 2 para feminino"));      
                } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "Erro.");
                  valido = false;
                }
            }while (valido == false); 
            
            if (sexo == 1) sexmas++; else {sexfem++;}
            
          valido= false;

           idade = Integer.parseInt(JOptionPane.showInputDialog("Informe Idade"));
           if (idade >18) i18++;
           if (idade <27) i19++;
           if (idade <42) i20++;
           if (idade >50) i21++;
          
           falta = Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero de faltas"));
             
           qtfilhos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos filhos voce tem"));
        
           cf = Integer.parseInt(JOptionPane.showInputDialog("É cadastrado no clube fidelidade? 1 para sim 2 para nao"));
           
          


}
JOptionPane.showMessageDialog(null,"Quantidade de pessoas cadastrada: " + qtpe);
JOptionPane.showMessageDialog(null,"Quantidade de homens: " + sexmas +"\nQuantidade de mulheres: " + sexfem);
JOptionPane.showMessageDialog(null,"Quantidade de 18 a 26: " + i18 +"\nQuantidade de 27 a 40: " + i19 + "\n Quantidade de 40 a 50" + i20 + "\nQuantidade acima de 50" +i21 );
JOptionPane.showMessageDialog(null,"Quantidade de Desenvolvedor Java Júnior: " + cargo1 +"\nQuantidade de Desenvolvedor Java Pleno : " + cargo2 + "\nQuantidade De Desenvolvedor Jana Sênior" +cargo3+ "\nQuantidade de Administrador de Banco de Dados" + cargo4 + "\n Quantidade de Analista Júnior" + cargo5 + "\n Quanitade de Analista Pleno" + cargo6 + "\nQuantidade de analista senior" + cargo7 + "\nQuantidade de Analista de software" + cargo8 + "Quantidade de gerente de projetos"+cargo9);





    }
}
