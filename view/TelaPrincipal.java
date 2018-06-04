package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
    }

    public TelaPrincipal(String permissao) {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        lbldata.setText(sdf.format(new Date()));
        setLocationRelativeTo(null);
        validaPermissoes(permissao);
//        Tarefa.setVisible(false);

    }

    public void validaPermissoes(String permissao) {
        if (permissao.equalsIgnoreCase("vendedor")) {
          btnCadastroFuncionario.setVisible(false);
//           btnTarefa.setVisible(false);
//            Tarefa.setVisible(true);
        }if (permissao.equalsIgnoreCase("administrador")) {
//            Tarefa.setVisible(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jdpPanel = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnTeste = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCadastroFuncionario = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton1.setText("jButton1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/img.jpg"))); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMinimumSize(new java.awt.Dimension(1200, 710));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 710));

        jdpPanel.setBackground(new java.awt.Color(51, 51, 255));
        jdpPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Papel-de-parede-Natureza-Por-do-sol-1.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jdpPanel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPanelLayout = new javax.swing.GroupLayout(jdpPanel);
        jdpPanel.setLayout(jdpPanelLayout);
        jdpPanelLayout.setHorizontalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jdpPanelLayout.setVerticalGroup(
            jdpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbldata.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldata.setText("data label");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sistema Concessionaria");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_clientes.png"))); // NOI18N
        jButton7.setToolTipText("Cadastrar Cliente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping_cart.png"))); // NOI18N
        btnVenda.setToolTipText("Carrinho De Compras");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnTeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info-alt-48.png"))); // NOI18N
        btnTeste.setToolTipText("Informações Fornecedor");
        btnTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesteActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/miscellaneous-03-48.png"))); // NOI18N
        jButton5.setToolTipText("Listar Fornecedores");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCadastroFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contact-new.png"))); // NOI18N
        btnCadastroFuncionario.setToolTipText("Cadastro Funcionario");
        btnCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users_1.png"))); // NOI18N
        btnEstoque.setToolTipText("Tabela De Clientes");
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseClicked(evt);
            }
        });
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/package_settings (1).png"))); // NOI18N
        jButton6.setToolTipText("Estoque");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-48.png"))); // NOI18N
        btnSair.setToolTipText("Logout");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(571, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(104, 104, 104)
                        .addComponent(lbldata)
                        .addGap(490, 490, 490))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jdpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldata)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnTeste.getAccessibleContext().setAccessibleDescription("Vendas");
        btnEstoque.getAccessibleContext().setAccessibleName("Estoque");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        TabelaClientes a = new TabelaClientes();
        jdpPanel.add(a);
        a.setVisible(true);

    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked

    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncionarioActionPerformed
        CadastroUsuario a = new CadastroUsuario();
        jdpPanel.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnCadastroFuncionarioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TabelaFornecedores a = new TabelaFornecedores();
        jdpPanel.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesteActionPerformed
        CadastroFornecedor ven = new CadastroFornecedor();
        jdpPanel.add(ven);
        ven.setVisible(true);
    }//GEN-LAST:event_btnTesteActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        VenderView a = new VenderView();
        jdpPanel.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TabelaProdutos a = new TabelaProdutos();
        jdpPanel.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CadastroCliente a = new CadastroCliente();
        jdpPanel.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroFuncionario;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTeste;
    private javax.swing.JButton btnVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JDesktopPane jdpPanel;
    private javax.swing.JLabel lbldata;
    // End of variables declaration//GEN-END:variables
}
