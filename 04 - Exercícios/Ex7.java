import javax.swing.*;

/**
 * Ex7
 */
public class Ex7 {

    public static void main(String[] args) {
       
         //variaveis
    int vida = 7 ;
    String palavraChave = "ESTUDAR";
    String sair = "" ;
    Object[] menus = {"Jogar uma palavra" , "Jogar uma letra" , "sair"};
    String letra = "" ;
    String letras = "" ;
    String palavra = "" ;
    boolean valido = false ;
    Object menu = "";

    //laços
    while (vida > 0 ) {
        
        do{
            try{
                menu = JOptionPane.showInputDialog(null, " Escolha uma opcao \n numero de vidas: "+vida+"\nLetras descobertas: "+letras, "jogo da forca" , JOptionPane.PLAIN_MESSAGE, null, menus , "");
                valido = true;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Erro.");
                valido=false;
            }
        }while(valido==false);

            if (menu.equals ("sair")){
            break;
        }
        valido = false;
        if (menu.equals("Jogar uma letra")){
            
            do{
                try {
                    letra = JOptionPane.showInputDialog(null, "Digite uma letra");
                    letra = letra.toUpperCase().trim();
                    valido = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro.");
                    valido = false;
                }
            }while(valido == false);

            switch (letra) {
                case "E":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " E " ;
                    break;
                case "S":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " S " ;
                    break;
                case "T":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " T " ;
                    break;
                case "U":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " U " ;
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " D " ;
                    break;
                case "A":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " A " ;
                    break;
                case "R":
                    JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
                    letras += " R " ;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Erro.");
                    vida--;
                    break;
            }
        }
        valido = false;
        if(menu.equals("Jogar uma palavra")){

            do {
                try {
                    palavra = JOptionPane.showInputDialog(null, "Insira uma palavra ");
                    palavra = palavra.toUpperCase().trim();
                    valido = true ;    
                } catch (Exception e) {
                    valido = false;
                    JOptionPane.showMessageDialog(null, "Erro.");
        
                    
                }
                
            } while (valido==false);
            if (palavra.equals(palavraChave)) {
            JOptionPane.showMessageDialog(null, "Voce acertou");
            break;
            

            }else {
                JOptionPane.showMessageDialog(null , "Nao consegue");
                vida--;
            }

        }
    }












    
   












}





}
