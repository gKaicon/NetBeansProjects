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
public class DAOItensCompra {

    DAOCompra daoCompra = new DAOCompra();
    DAOProduto daoProduto = new DAOProduto();
    
    public List< ItensCompra> getLista() {
        String sql = "Select * from itensCompra";
        List<ItensCompra> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ItensCompra obj = new ItensCompra();
                obj.setId_ItensCompra(rs.getInt("id_itensCompra"));
                obj.setCompra(daoCompra.localizar(rs.getInt("id_Compra")));
                obj.setProduto(daoProduto.localizar(rs.getInt("id_Produto")));
                obj.setQntd(rs.getInt("quantidade"));
                obj.setPrecoCompra(rs.getDouble("precoCompra"));
                obj.setSubtotal(rs.getDouble("subtotal"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(ItensCompra itensCompra) {
        if (itensCompra.getId_ItensCompra() == null) {
            return incluir(itensCompra);
        } else {
            return alterar(itensCompra);
        }
    }

    public boolean incluir(ItensCompra obj) {
        String sql = " insert into itensCompra ( id_Compra, id_Produto, quantidade, precoCompra, subtotal) values(? , ? , ? , ? , ?) ; ";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCompra().getId_Compra());
            pst.setInt(2, obj.getProduto().getId_Produto());            
            pst.setDouble(3, obj.getQntd());
            pst.setDouble(4, obj.getPrecoCompra());
            pst.setDouble(5, obj.getSubtotal());
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensCompra salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensCompra não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(ItensCompra obj) {
        String sql = "update itensCompra set id_Compra = ? , id_Produto = ? , quantidade = ? , subtotal = ? , precoCompra = ?  where id_ItensCompra = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCompra().getId_Compra());
            pst.setInt(2, obj.getProduto().getId_Produto());
            pst.setInt(3, obj.getQntd());
            pst.setDouble(4, obj.getSubtotal());
            pst.setDouble(5, obj.getPrecoCompra());
            pst.setInt(6, obj.getId_ItensCompra());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensCompra salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensCompra não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public ItensCompra localizar(Integer id) {
        String sql = "select * from ItensCompra where id_ItensCompra = ?;";
        ItensCompra obj = new ItensCompra();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_ItensCompra(rs.getInt("id_itensCompra"));
                obj.setCompra(daoCompra.localizar(rs.getInt("id_Compra")));
                obj.setProduto(daoProduto.localizar(rs.getInt("id_Produto")));
                obj.setQntd(rs.getInt("quantidade"));
                obj.setPrecoCompra(rs.getDouble("precoCompra"));
                obj.setSubtotal(rs.getDouble("subtotal"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }

    public List<ItensCompra> getListaPorCompra(Compra compra) {
        List<ItensCompra> lista = new ArrayList<>();
        return lista.stream().filter(c -> c.getCompra().equals(compra)).collect(Collectors.toList());
    }

    public boolean delete(ItensCompra obj) {
        String sql = "delete from itensCompra where id_ItensCompra = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_ItensCompra());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensCompra excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensCompra não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
    public boolean aumentaEstoque(ItensCompra obj){
        String sql = "Update Produto set unidade = unidade + ? where id_Produto = ?;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getQntd());
            pst.setInt(2, obj.getProduto().getId_Produto());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "ItensCompra excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ItensCompra não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
