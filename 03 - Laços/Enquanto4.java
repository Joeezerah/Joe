// Importar componentes
import javax.swing.*;

//classe
/**
 * Enquanto4
 */
class Enquanto4{

    //iniciar sistema
    public static void main(String[] args) {
        //variaveis
        String nome;
        int idade;

        //perguntar o nome
        nome = JOptionPane.showInputDialog(null, "Informe um nome ou SAIR para finalizar");

        //laço
        while(!nome.equals("sair")){

            //perguntar a idade
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade."));

            //criar frase
            JOptionPane.showMessageDialog(null, "Olá "+nome+" você tem "+idade+"anos");

            //perguntar o nome
            nome = JOptionPane.showInputDialog(null,"Informe um nome ou SAIR para finalizar");


        }
    }
}
