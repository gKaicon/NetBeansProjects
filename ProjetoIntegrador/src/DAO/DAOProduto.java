package DAO;

import MODELO.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author KAICON
 */
public class DAOProduto {

    DAOFornecedor daoFornecedor = new DAOFornecedor();
    ItensCompra ItensCompra = new ItensCompra();
    ItensVenda ItensVenda = new ItensVenda();

    public List< Produto> getLista() {
        String sql = "Select * from Produto";
        List<Produto> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Produto obj = new Produto();
                obj.setId_Produto(rs.getInt("id_Produto"));
                obj.setFornecedor(daoFornecedor.localizar(rs.getInt("id_Fornecedor")));
                obj.setNome(rs.getString("nome"));
                obj.setPrecoCusto(rs.getDouble("precoCusto"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setUnidade(rs.getInt("unidade"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(Produto Produto) {
        if (Produto.getId_Produto() == null) {
            return incluir(Produto);

        } else {
            return alterar(Produto);
        }
    }

    public boolean incluir(Produto obj) {
        String sql = " insert into Produto (id_Fornecedor, nome, precoCusto, precoVenda, unidade) values(? , ? , ? , ? , ?) ; ";
        int unidade = 0;
        obj.setUnidade(unidade);
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            pst.setString(2, obj.getNome());
            pst.setDouble(3, obj.getPrecoCusto());
            pst.setDouble(4, obj.getPrecoVenda());
            pst.setInt(5, obj.getUnidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }
    }

    public boolean alterar(Produto obj) {
        String sql = "update Produto set id_Fornecedor = ? , nome = ? , precoCusto = ? , precoVenda = ? , unidade = ? where id_Produto = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            pst.setString(2, obj.getNome());
            pst.setDouble(3, obj.getPrecoCusto());
            pst.setDouble(4, obj.getPrecoVenda());
            pst.setDouble(5, obj.getUnidade());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public Produto localizar(Integer id) {
        String sql = "select * from Produto where id_Produto = ? ;";
        Produto obj = new Produto();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Produto(rs.getInt("id_Produto"));
                obj.setFornecedor(daoFornecedor.localizar(rs.getInt("id_Fornecedor")));
                obj.setNome(rs.getString("nome"));
                obj.setPrecoCusto(rs.getDouble("precoCusto"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setUnidade(rs.getInt("unidade"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }

    public boolean atualizaEstoqueCompra(Produto obj, int qntd) {
        String sql = "update Produto set  unidade = ? where id_Produto = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            pst.setDouble(2, obj.getUnidade() + qntd);

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "O estoque foi atualizado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "O estoque não foi atualizado com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }
    }

    public boolean atualizaEstoqueVenda(Produto obj, int qntd) {
        String sql = "update Produto set  unidade = ? where id_Produto = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            if (obj.getUnidade() > (qntd)) {
                pst.setDouble(2, qntd - obj.getUnidade());
            } else {
                JOptionPane.showMessageDialog(null, "O produto foi salvo, mas não foi vendido");
            }
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "O estoque foi atualizado com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "O estoque não foi atualizado com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }
    }
    public boolean delete(Produto obj) {
        String sql = "delete from Produto where id_Produto = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Produto());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
