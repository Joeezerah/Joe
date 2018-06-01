package controller;

import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;

public class TableFactory {

    public DefaultTableModel exibirDados() {
        DefaultTableModel exibirDados = new DefaultTableModel();

        exibirDados.addColumn("Nome");
        exibirDados.addColumn("Cidade");
        exibirDados.addColumn("CPF");
        exibirDados.addColumn("Contato");

        for (int i = 0; i < Cliente.dados.size(); i++) {
            exibirDados.addRow(new Object[]{Cliente.dados.get(i).nome, Cliente.dados.get(i).endereco, Cliente.dados.get(i).cpf, Cliente.dados.get(i).contato});

        }

        return exibirDados;
    }

    public void excluir(int linha) {
        Cliente.dados.remove(linha);
    }

    
    public void alterar(String Novonome, String Novoendereco, String Novocontato, String Novocpf, int linha) {

        Cliente p = new Cliente();
        p.nome = Novonome ;
        p.endereco = Novoendereco;
        p.contato = Novocontato;
        p.cpf =Novocpf;

        // Realizar a alteração
        Cliente.dados.set(linha, p);

    }
    
    
    public DefaultTableModel exibirDadoss() {
        DefaultTableModel exibirDadoss = new DefaultTableModel();

        exibirDadoss.addColumn("Nome");
        exibirDadoss.addColumn("Valor");
        exibirDadoss.addColumn("Quantidade");
   

        for (int i = 0; i < Produto.dados.size(); i++) {
            exibirDadoss.addRow(new Object[]{Produto.dados.get(i).nome, Produto.dados.get(i).valor, Produto.dados.get(i).quantidade });

        }

        return exibirDadoss;
    }

    public void excluirr(int linha) {
        Produto.dados.remove(linha);
    }

    
    public void alterarr(String Novonome, String Novoendereco, String Novocontato, String Novocpf, int linha) {

        Cliente p = new Cliente();
        p.nome = Novonome ;
        p.endereco = Novoendereco;
        p.contato = Novocontato;
        p.cpf =Novocpf;

        // Realizar a alteração
        Cliente.dados.set(linha, p);

    }
}
