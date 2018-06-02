package controller;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import model.Cliente;
import static model.Cliente.dados;

public class ListarCombobox {
    

	// Método de cadastro
	public void cadastrar(String nomeProduto) {

		// Instanciar
		Cliente p = new Cliente();
		p.setnome(nomeProduto);
		

		// Adicionar ao ArrayList
		dados.add(p);

	}

    // Método de listar
    public DefaultComboBoxModel<Cliente> listar() {

        // Vetor
        Vector<Cliente> listaDeProdutos = new Vector<>();

        // Atribuir um título
        Cliente t = new Cliente();

        if (dados.size() > 0) {
            t.setnome("Selecione um produto");
        } else {
            t.setnome("Não há produtos cadastrados");
        }

        listaDeProdutos.add(t);

        // Laço
        for (int i = 0; i < dados.size(); i++) {
            listaDeProdutos.add(dados.get(i));
        }

        // DefaultComboModel
        DefaultComboBoxModel<Cliente> modelo = new DefaultComboBoxModel<>(listaDeProdutos);

        // Retorno
        return modelo;
    }

}
