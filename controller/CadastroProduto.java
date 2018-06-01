
package controller;

import model.Produto;


public class CadastroProduto {
    
     public boolean cadastrar(String nomeProduto, String ValorProduto, String QuantidadeProduto) {

        try {
            Produto p = new Produto();
            p.valor = ValorProduto;
            p.nome = nomeProduto;
            p.quantidade = QuantidadeProduto;
            

            Produto.dados.add(p);
            System.out.println(Produto.dados.size());
        } catch (Exception e) {
            System.out.println("e " + e);
        }
        return true;

    }
    
}
