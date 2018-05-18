import javax.swing.*;

/**
 * Ex6
 */
public class Ex6 {

    public static void main(String[] args) {
        
//variaveis
String nome = "";
int sexmas = 0 ;
int sexfem = 0 ; 
int sexo = 0 ;
double n1 = 0 ;
double n2 = 0 ; 
double n3 = 0 ; 
double n4 = 0 ; 
double media = 0;
double Parabens = 0 ;
double Otimo = 0 ;
double bom = 0 ;
double satisfatorio = 0;
double recuperacao = 0;
double reprovado = 0;
double qtalunos = 0;
boolean valido  = true;
double p1 = 0;
double p2 = 0;
double p3 = 0;
double p4 = 0;
double p5 = 0;
double p6 = 0;


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
                qtalunos++;
            }
            valido = false;
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
        
        do{
             do {
                try{
                n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 1"));                    
                n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 2"));
                n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 3"));
                n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 4"));
                valido = true;
                media = (n1+n2+n3+n4)/4;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro.");
                valido = false;
            }
        }while (((n1<0) || (n1>10)) || ((n2<0) || (n2>10)) ||((n3<0) || (n3>10)) ||((n4<0) || (n4>10))); 
            

        }while(valido == false);
        

    if (media == 10) {
        JOptionPane.showMessageDialog(null,"Parabens" + media);
        Parabens++;
    }else if (media >= 9) {
        JOptionPane.showMessageDialog(null,"Otimo" + media);
        Otimo++;
    } else if (media >= 8) {
        JOptionPane.showMessageDialog(null,"Bom" + media);
        bom++;
    }else if (media >= 7) {
        JOptionPane.showMessageDialog(null,"Satisfatorio" + media);
        satisfatorio++;
    }else if (media >= 5) {
        JOptionPane.showMessageDialog(null,"Recuperaçao" + media);
        recuperacao++;
    }else {
        JOptionPane.showMessageDialog(null,"Reprovado" + media);
        reprovado++;
    }
    valido = false;


}

//porcentagens

p1 = (Parabens/qtalunos)*100;
p2 = (Otimo/qtalunos)*100;
p3 = (bom/qtalunos)*100;
p4 = (satisfatorio/qtalunos)*100;
p5 = (recuperacao/qtalunos)*100;
p6 = (reprovado/qtalunos)*100;

//exibir o texto
    JOptionPane.showMessageDialog(null," Dez : % " + Parabens + " " +p1);
    JOptionPane.showMessageDialog(null," Nove : % " + Otimo + " " +p2 );
    JOptionPane.showMessageDialog(null," Oito : % " + bom + " " +p3);
    JOptionPane.showMessageDialog(null," Sete : % " + satisfatorio + " " +p4+ "%");
    JOptionPane.showMessageDialog(null," cinco : % " + recuperacao + " "+ p5);
    JOptionPane.showMessageDialog(null," Menos de cinco : " + reprovado + " " +p6);
    JOptionPane.showMessageDialog(null," Homens : " +sexmas);
    JOptionPane.showMessageDialog(null," Mulheres : " +sexfem);










    }
}