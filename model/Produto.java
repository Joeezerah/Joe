
package model;

import java.util.ArrayList;


public class Produto {
    public  String nome;
    public String quantidade;
    public String valor;

   public static ArrayList<Produto> dadosProd = new ArrayList<>();

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
