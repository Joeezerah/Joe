import javax.swing.*;

public class TratamentoErros{

public static void main (String [] args){

try{
int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero"));
}catch(Exception e){
JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
}


























}
}