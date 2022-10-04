package DAO;

import MODELO.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.stream.Collectors;

/**
 *
 * @author KAICON
 */
public class DAOItensVenda {

    DAOVenda daoVenda = new DAOVenda();
    DAOProduto daoProduto = new DAOProduto();
            
    
     public List< ItensVenda> getLista() {
        String sql = "Select * from itensVenda";
        List<ItensVenda> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ItensVenda obj = new ItensVenda();
                obj.setId_ItensVenda(rs.getInt("id_ItensVenda"));
                obj.setVenda(daoVenda.localizar(rs.getInt("id_Venda")));
                obj.setProduto(daoProduto.localizar(rs.getInt("id_Produto")));
                obj.setQntd(rs.getInt("quantidade"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setSubtotal(rs.getDouble("subtotal"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(ItensVenda itensVenda) {
        if (itensVenda.getId_ItensVenda() == null) {
            return incluir(itensVenda);

        } else {
            return alterar(itensVenda);
        }
    }

    public boolean incluir(ItensVenda obj) {
        String sql = " insert into itensVenda ( id_Venda, id_Produto, quantidade, precoVenda, subtotal) values(? , ? , ? , ? , ?) ; ";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getVenda().getId_Venda());
            pst.setInt(2, obj.getProduto().getId_Produto());            
            pst.setDouble(3, obj.getQntd());
            pst.setDouble(4, obj.getPrecoVenda());
            pst.setDouble(5, obj.getSubtotal());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensVenda salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensVenda não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(ItensVenda obj) {
        String sql = "update itensVenda set id_Venda = ? , id_Produto = ? , quantidade = ? , subtotal = ? , precoVenda = ?  where id_ItensVenda = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getVenda().getId_Venda());
            pst.setInt(2, obj.getProduto().getId_Produto());
            pst.setInt(3, obj.getQntd());
            pst.setDouble(4, obj.getSubtotal());
            pst.setDouble(5, obj.getPrecoVenda());
            pst.setInt(6, obj.getId_ItensVenda());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensVenda salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensVenda não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public List<ItensVenda> getListaPorVenda(Venda Venda) {
        List<ItensVenda> lista = new ArrayList<>();
        return lista.stream().filter(c -> c.getVenda().equals(Venda)).collect(Collectors.toList());
    }

    public ItensVenda localizar(Integer id) {
        String sql = "select * from ItensVenda where id_ItensVenda = ?;";
        ItensVenda obj = new ItensVenda();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_ItensVenda(rs.getInt("id_itensVenda"));
                obj.setVenda(daoVenda.localizar(rs.getInt("id_Venda")));
                obj.setProduto(daoProduto.localizar(rs.getInt("id_Produto")));
                obj.setQntd(rs.getInt("quantidade"));
                obj.setPrecoVenda(rs.getDouble("precoVenda"));
                obj.setSubtotal(rs.getDouble("subtotal"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }
    
    public boolean delete(ItensVenda obj) {
        String sql = "delete from itensVenda where id_ItensVenda = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_ItensVenda());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensVenda excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensVenda não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
