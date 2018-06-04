package view;

import controller.CadastrarVenda;
import controller.ListarCombobox;
import controller.TableFactory;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import model.VendaProduto;

public class VenderView extends javax.swing.JInternalFrame {

    TableFactory tf = new TableFactory();
    ListarCombobox a = new ListarCombobox();
    Vector<Cliente> listaDeProdutos = new Vector<>();
     CadastrarVenda cc = new CadastrarVenda();
     
     Cliente c = new Cliente();
     Produto p = new Produto();
     

    public VenderView() {
        initComponents();
        jcbCliente.setModel(a.listar());
        jcbProduto.setModel(a.listar1());

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbProduto = new javax.swing.JComboBox<>();
        lblUni = new javax.swing.JLabel();
        btnFinVen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Vender");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping-cart-24.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Escolha o produto qual deseja vender :");

        jcbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdutoActionPerformed(evt);
            }
        });

        btnFinVen.setText("Finalizar Venda");
        btnFinVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinVenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Selecione o cliente qual realizara a compra :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblUni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFinVen)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbProduto, 0, 135, Short.MAX_VALUE)
                            .addComponent(jcbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnFinVen)
                .addGap(18, 18, 18)
                .addComponent(lblUni)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public double calcula(){
        
        
        return 0;
       
    }
    
    private void btnFinVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinVenActionPerformed
        JOptionPane.showMessageDialog(null, "Venda do produto : "+ jcbProduto.getSelectedItem().toString() + "para o cliente: " + jcbCliente.getSelectedItem().toString() + " realizada com sucesso");
        this.dispose();

    }//GEN-LAST:event_btnFinVenActionPerformed

    private void jcbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutoActionPerformed

    }//GEN-LAST:event_jcbProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JComboBox<Produto> jcbProduto;
    private javax.swing.JLabel lblUni;
    // End of variables declaration//GEN-END:variables

}
