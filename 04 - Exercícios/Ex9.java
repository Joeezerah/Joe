//componentes
import javax.swing.*;

/**
 //class
 */public class Ex9 {

    

//iniciar sistema
public static void main(String[] args) {

    //variaveis
    int ano = 0 ;
    int menu = 1 ;
    boolean valido = false;
    int resultado = 0;

   //laço 
    while(menu != 0){

        do{
            try {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para sair ou outro numero para continuar"));
                valido = true;
                
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null,"Error.");
                valido = false ;    
            }
        } while(valido == false);
        if(menu == 0){
            break;
        }
        valido = false ;
        do{
            try {
                ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano"));
                valido = true;
                
            } catch (Exception e) {
                valido = false ;
                JOptionPane.showMessageDialog(null,"Error.");
                
            }
            


        }while (valido == false);

        //verificaçao
        resultado = (ano % 4);
        if (resultado==0) {
           JOptionPane.showMessageDialog(null,"E bissexto"); 
        }else{
            JOptionPane.showMessageDialog(null, "nao e bissexto");
        }
           
        } 
       


        
    
        
    }
    }


