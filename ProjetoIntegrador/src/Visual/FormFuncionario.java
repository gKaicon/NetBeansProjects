package Visual;
import MODELO.*;
import DAO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */

public class FormFuncionario extends javax.swing.JDialog {

    private DAOFuncionario dao = new DAOFuncionario();

    public void atualizaTabela() {

        listFuncionario.clear();
        listFuncionario.addAll(dao.getLista());
        int linha = listFuncionario.size() - 1;
        if (linha >= 0) {
            tableFuncionario.setRowSelectionInterval(linha, linha);
            tableFuncionario.scrollRectToVisible(
                    tableFuncionario.getCellRect(linha, linha, true)
            );
        }
    }

    private void trataEdicao(boolean editando) {
        btnCancelar.setEnabled(editando);
        btnSalvar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        btnExcluir.setEnabled(!editando);
        btnNovo.setEnabled(!editando);
        tabGuias.setEnabled(!editando);

        btnFechar.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnProximo.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);

        txtNome.setEnabled(editando);
        txtIdade.setEnabled(editando);
        txtEndereco.setEnabled(editando);
        txtTelefone.setEnabled(editando);

        tableFuncionario.setEnabled(!editando);
    }

    public boolean validaCampos() {
        if (!(txtNome.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o nome do Funcionario");
            txtNome.requestFocus();
            return false;
        }
        if (!(txtIdade.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a Idade do Funcionario");
            txtIdade.requestFocus();
            return false;

        }
        if (!(txtEndereco.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Endereço do Funcionario");
            txtEndereco.requestFocus();
            return false;

        }
        if (!(txtTelefone.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Telefone do Funcionario");
            txtTelefone.requestFocus();
            return false;

        }
        return true;
    }

    public FormFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setMinimumSize(new java.awt.Dimension(1366, 695));
        initComponents();
        atualizaTabela();
        trataEdicao(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listFuncionario = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <Funcionario>())
        ;
        panelNavegacao = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        panelOrganizacao = new javax.swing.JPanel();
        tabGuias = new javax.swing.JTabbedPane();
        panelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();
        panelDados = new javax.swing.JPanel();
        lblIdFuncionario = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        panelAcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtIdFuncionario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblInformacaoEndereco = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Funcionários");

        panelNavegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        panelNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnAnterior);

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnPrimeiro);

        btnUltimo.setText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnUltimo);

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnProximo);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        panelNavegacao.add(btnFechar);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listFuncionario, tableFuncionario);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id_Funcionario}"));
        columnBinding.setColumnName("Id_ Funcionario");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idade}"));
        columnBinding.setColumnName("Idade");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereço");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tableFuncionario);

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabGuias.addTab("Listagem", panelListagem);

        lblIdFuncionario.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblIdFuncionario.setText("Id_Funcionário");

        lblNome.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblNome.setText("Nome");

        lblIdade.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblIdade.setText("Idade");

        jLabel4.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jLabel4.setText("Endereço");

        lblTelefone.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        lblTelefone.setText("Telefone");

        panelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        panelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        panelAcoes.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnEditar);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnSalvar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelAcoes.add(btnCancelar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panelAcoes.add(btnExcluir);

        txtIdFuncionario.setEditable(false);
        txtIdFuncionario.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFuncionario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id_Funcionario}"), txtIdFuncionario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFuncionario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFuncionario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idade}"), txtIdade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEndereco.setToolTipText("Rua, nº, Bairro, Cidade");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFuncionario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.endereco}"), txtEndereco, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblInformacaoEndereco.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblInformacaoEndereco.setText("Rua, nº , Bairro, Cidade");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableFuncionario, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefone}"), txtTelefone, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIdFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInformacaoEndereco)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdFuncionario)
                    .addComponent(txtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(8, 8, 8)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInformacaoEndereco))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, lblIdFuncionario, lblIdade, lblNome, lblTelefone});

        tabGuias.addTab("Dados", panelDados);

        javax.swing.GroupLayout panelOrganizacaoLayout = new javax.swing.GroupLayout(panelOrganizacao);
        panelOrganizacao.setLayout(panelOrganizacaoLayout);
        panelOrganizacaoLayout.setHorizontalGroup(
            panelOrganizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrganizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGuias)
                .addContainerGap())
        );
        panelOrganizacaoLayout.setVerticalGroup(
            panelOrganizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrganizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGuias, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOrganizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOrganizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int linha = tableFuncionario.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tableFuncionario.setRowSelectionInterval(linha, linha);
        tableFuncionario.scrollRectToVisible(tableFuncionario.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed
    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        tableFuncionario.setRowSelectionInterval(0, 0);
        tableFuncionario.scrollRectToVisible(tableFuncionario.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int linha = tableFuncionario.getRowCount() - 1;
        tableFuncionario.setRowSelectionInterval(linha, linha);
        tableFuncionario.scrollRectToVisible(tableFuncionario.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int linha = tableFuncionario.getSelectedRow();
        if ((linha + 1) <= (tableFuncionario.getRowCount() - 1)) {
            linha++;
        }
        tableFuncionario.setRowSelectionInterval(linha, linha);
        tableFuncionario.scrollRectToVisible(tableFuncionario.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        listFuncionario.add(new Funcionario());
        int linha = listFuncionario.size() - 1;
        tableFuncionario.setRowSelectionInterval(linha, linha);
        txtNome.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNome.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (validaCampos()) {
            int linhaSelecionada = tableFuncionario.getSelectedRow();
            Funcionario obj = listFuncionario.get(linhaSelecionada);
            dao.salvar(obj);
            this.atualizaTabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.atualizaTabela();
        trataEdicao(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Confirme a exclusão");
        if (option == 0) {
        try {
            Integer linhaSelecionada = tableFuncionario.getSelectedRow();
            Funcionario obj = listFuncionario.get(linhaSelecionada);
            dao.delete(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há Compra para excluisão");
        }
        this.atualizaTabela();
    }
    }//GEN-LAST:event_btnExcluirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblInformacaoEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private java.util.List<Funcionario> listFuncionario;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JPanel panelNavegacao;
    private javax.swing.JPanel panelOrganizacao;
    private javax.swing.JTabbedPane tabGuias;
    private javax.swing.JTable tableFuncionario;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdFuncionario;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}