package Visual;


import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panelEdit = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBarra = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenuItem();
        menuForncedor = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenuItem();
        menuCompras = new javax.swing.JMenu();
        menuCompra = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distribuidora VLFH");

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitulo.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        lblTitulo.setText("Distribuidora Verduras, Legumes, Frutas e Hortaliças");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Software desenvolvido por Gabriel Káicon Batista Hilário, aluno do \nInstituto Federal de Minas Gerais - Campus de São João Evangelista.\n\nProjeto planejado sob orientação de Rosinei Soares de Figueiredo, \nJanelas e Sistema Desenvolvido sob a orientação de Ítalo Magno Pereira, \nBanco de Dados desenvolvido sob orientação de Dayler Vinicius Miranda Alves.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuCadastro.setText("Cadastro");

        menuFuncionario.setText("Funcionário");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionario);

        menuForncedor.setText("Fornecedor");
        menuForncedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuForncedorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuForncedor);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuProduto.setText("Produto");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuProduto);

        menuBarra.add(menuCadastro);

        menuCompras.setText("Compras");

        menuCompra.setText("Compra");
        menuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompraActionPerformed(evt);
            }
        });
        menuCompras.add(menuCompra);

        menuBarra.add(menuCompras);

        menuVendas.setText("Vendas");

        menuVenda.setText("Venda");
        menuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendaActionPerformed(evt);
            }
        });
        menuVendas.add(menuVenda);

        menuBarra.add(menuVendas);

        menuSobre.setText("Sobre");

        menuAjudaSobre.setText("Informação");
        menuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaSobreActionPerformed(evt);
            }
        });
        menuSobre.add(menuAjudaSobre);

        menuBarra.add(menuSobre);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        FormCliente formc = new FormCliente(this, true);
        formc.setLocationRelativeTo(null);
        formc.setVisible(true);
        formc.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        FormFuncionario formfu = new FormFuncionario(this, true);
        formfu.setLocationRelativeTo(null);
        formfu.setVisible(true);
        formfu.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuForncedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuForncedorActionPerformed
        FormFornecedor formfo = new FormFornecedor(this, true);
        formfo.setLocationRelativeTo(null);
        formfo.setVisible(true);
        formfo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_menuForncedorActionPerformed

    private void menuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutoActionPerformed
        FormProduto formp = new FormProduto(this, true);
        formp.setLocationRelativeTo(null);
        formp.setVisible(true);
        formp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuProdutoActionPerformed

    private void menuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompraActionPerformed
        FormCompra formC = new FormCompra(this, true);
        formC.setLocationRelativeTo(null);
        formC.setVisible(true);
        formC.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuCompraActionPerformed

    private void menuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendaActionPerformed
        FormVenda formV = new FormVenda(this, true);
        formV.setLocationRelativeTo(null);
        formV.setVisible(true);
        formV.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuVendaActionPerformed

    private void menuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaSobreActionPerformed
        FormAjuda formA = new FormAjuda(this, true);
        formA.setLocationRelativeTo(null);
        formA.setVisible(true);
        formA.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuAjudaSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal form = new FormPrincipal();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem menuAjudaSobre;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuCompra;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenuItem menuForncedor;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuProduto;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuVenda;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelEdit;
    // End of variables declaration//GEN-END:variables

}