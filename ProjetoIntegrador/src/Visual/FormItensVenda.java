package Visual;

import MODELO.*;
import DAO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class FormItensVenda extends javax.swing.JDialog {

    private DAOItensVenda daoI = new DAOItensVenda();
    private DAOVenda daoV = new DAOVenda();
    private DAOProduto daoP = new DAOProduto();
    private Venda venda;

    public void atualizaTabela() {

        listItensVenda.clear();
        listItensVenda.addAll(daoI.getListaPorVenda(venda));
        int linha = listItensVenda.size() - 1;
        if (linha >= 0) {
            tableItensVenda.setRowSelectionInterval(linha, linha);
            tableItensVenda.scrollRectToVisible(tableItensVenda.getCellRect(linha, linha, true));
        }

    }

    public void trataEdicao(boolean editando) {

        btnCancelar.setEnabled(editando);
        btnSalvar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        btnExcluir.setEnabled(!editando);
        btnNovo.setEnabled(!editando);
        tabGuias.setEnabled(!editando);

        btnFechar.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);
        btnProximo.setEnabled(!editando);

        txtQuantidade.setEnabled(editando);
        cbProduto.setEnabled(editando);

        tableItensVenda.setEnabled(!editando);

    }

    public boolean validaCampos() {
        if (!(cbProduto.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe o Produto");
            cbProduto.requestFocus();
            return false;
        }

        if (!(txtQuantidade.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a Quantidade de produtos");
            txtQuantidade.requestFocus();
            return false;
        }
        return true;
    }

    public FormItensVenda(java.awt.Frame parent, boolean modal, Venda venda) {
        super(parent, modal);
        setMinimumSize(new java.awt.Dimension(1366, 695));
        initComponents();
        this.venda = venda;
        listProduto.clear();
        listProduto.addAll(daoP.getLista());
        listVenda.clear();
        listVenda.addAll(daoV.getLista());
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

        listProduto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Produto>())
        ;
        listVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Venda>())
        ;
        listItensVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<ItensVenda>())
        ;
        panelNavegacao = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        panelOrganizacao = new javax.swing.JPanel();
        tabGuias = new javax.swing.JTabbedPane();
        panelDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItensVenda = new javax.swing.JTable();
        panelListagem = new javax.swing.JPanel();
        panelAcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cbProduto = new javax.swing.JComboBox<>();
        txtIdItensVenda = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        txtIdVenda = new javax.swing.JTextField();
        lblIdVenda = new javax.swing.JLabel();
        lblItensVenda = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Itens da Venda");

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

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listItensVenda, tableItensVenda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${venda}"));
        columnBinding.setColumnName("Id_Venda");
        columnBinding.setColumnClass(MODELO.Venda.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id_ItensVenda}"));
        columnBinding.setColumnName("Id_ Itens Venda");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(MODELO.Produto.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${qntd}"));
        columnBinding.setColumnName("Quantidade");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subtotal}"));
        columnBinding.setColumnName("Subtotal");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precoVenda}"));
        columnBinding.setColumnName("Preço da Venda");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tableItensVenda);

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabGuias.addTab("Listagem", panelDados);

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

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listProduto, cbProduto);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto}"), cbProduto, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        txtIdItensVenda.setEditable(false);
        txtIdItensVenda.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id_ItensVenda}"), txtIdItensVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtQuantidade.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.qntd}"), txtQuantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtSubtotal.setEditable(false);
        txtSubtotal.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.subtotal}"), txtSubtotal, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtPrecoVenda.setEditable(false);
        txtPrecoVenda.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.precoVenda}"), txtPrecoVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtIdVenda.setEditable(false);
        txtIdVenda.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tableItensVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.venda.id_Venda}"), txtIdVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblIdVenda.setText("Id_Venda");

        lblItensVenda.setText("Id_ItensVenda");

        lblProduto.setText("Produto");

        lblQuantidade.setText("Quantidade");

        lblSubTotal.setText("Subtotal");

        lblPrecoVenda.setText("Preço da Venda");

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                    .addGroup(panelListagemLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelListagemLayout.createSequentialGroup()
                                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrecoVenda)
                                    .addComponent(lblSubTotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelListagemLayout.createSequentialGroup()
                                    .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblItensVenda)
                                        .addComponent(lblIdVenda)
                                        .addComponent(lblProduto)
                                        .addComponent(lblQuantidade))
                                    .addGap(41, 41, 41)
                                    .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIdItensVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdVenda)
                    .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdItensVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItensVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto))
                .addGap(18, 18, 18)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addGap(18, 18, 18)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTotal)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecoVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabGuias.addTab("Dados", panelListagem);

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
                .addComponent(tabGuias)
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
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        listItensVenda.add(new ItensVenda(this.venda));
        int linha = listItensVenda.size() - 1;
        tableItensVenda.setRowSelectionInterval(linha, linha);
        cbProduto.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtQuantidade.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnEditarActionPerformed
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            int linhaSelecionada = tableItensVenda.getSelectedRow();
            ItensVenda obj = listItensVenda.get(linhaSelecionada);
            if ((Integer.parseInt(txtQuantidade.getText())) > (obj.getProduto().getUnidade())) {
                txtQuantidade.requestFocus();
                JOptionPane.showMessageDialog(null, "Verifique se há produto no Estoque");
            }
            if (validaCampos() && (Integer.parseInt(txtQuantidade.getText())) < (obj.getProduto().getUnidade())) {
                this.venda.setValorTotal(this.venda.getValorTotal() + (obj.getQntd() * obj.getProduto().getPrecoVenda()));
                daoP.atualizaEstoqueVenda(obj.getProduto(), Integer.parseInt(txtQuantidade.getText()));
                daoP.atualizaEstoqueVenda(obj.getProduto(), Integer.parseInt(txtQuantidade.getText()));
                daoI.salvar(obj);
                atualizaTabela();
                trataEdicao(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!!");
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
                int linhaSelecionada = tableItensVenda.getSelectedRow();
                ItensVenda obj = listItensVenda.get(linhaSelecionada);
                daoI.delete(obj);
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "Não há Itens de compra para excluisão");
            }
            atualizaTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int linha = tableItensVenda.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tableItensVenda.setRowSelectionInterval(linha, linha);
        tableItensVenda.scrollRectToVisible(tableItensVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed
    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        tableItensVenda.setRowSelectionInterval(0, 0);
        tableItensVenda.scrollRectToVisible(tableItensVenda.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int linha = tableItensVenda.getRowCount() - 1;
        tableItensVenda.setRowSelectionInterval(linha, linha);
        tableItensVenda.scrollRectToVisible(tableItensVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int linha = tableItensVenda.getSelectedRow();
        if ((linha + 1) <= tableItensVenda.getRowCount() - 1) {
            linha++;
        }
        tableItensVenda.setRowSelectionInterval(linha, linha);
        tableItensVenda.scrollRectToVisible(tableItensVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed
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
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdVenda;
    private javax.swing.JLabel lblItensVenda;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSubTotal;
    private java.util.List<ItensVenda> listItensVenda;
    private java.util.List<Produto> listProduto;
    private java.util.List<Venda> listVenda;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JPanel panelNavegacao;
    private javax.swing.JPanel panelOrganizacao;
    private javax.swing.JTabbedPane tabGuias;
    private javax.swing.JTable tableItensVenda;
    private javax.swing.JTextField txtIdItensVenda;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSubtotal;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}