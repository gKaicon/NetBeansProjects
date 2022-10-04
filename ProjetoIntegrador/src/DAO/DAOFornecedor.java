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
public class DAOFornecedor {

    public List< Fornecedor> getLista() {
        String sql = "Select * from Fornecedor";
        List<Fornecedor> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Fornecedor obj = new Fornecedor();
                obj.setId_Fornecedor(rs.getInt("id_Fornecedor"));
                obj.setNome(rs.getString("nome"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setTelefone(rs.getString("telefone"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(Fornecedor Fornecedor) {
        if (Fornecedor.getId_Fornecedor() == null) {
            return incluir(Fornecedor);

        } else {
            return alterar(Fornecedor);
        }
    }

    public boolean incluir(Fornecedor obj) {
        String sql = " insert into Fornecedor (nome, endereco, telefone) values(? , ? , ?) ; ";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEndereco());
            pst.setString(3, obj.getTelefone());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(Fornecedor obj) {
        String sql = "update Fornecedor set nome = ?, endereco = ?, telefone = ?  where id_Fornecedor = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getEndereco());
            pst.setString(3, obj.getTelefone());
            pst.setInt(4, obj.getId_Fornecedor());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public Fornecedor localizar(Integer id) {
        String sql = "select * from Fornecedor where id_Fornecedor = ?;";
        Fornecedor obj = new Fornecedor();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Fornecedor(rs.getInt("id_Fornecedor"));
                obj.setNome(rs.getString("nome"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setTelefone(rs.getString("telefone"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }

    public boolean delete(Fornecedor obj) {
        String sql = "delete from Fornecedor where id_Fornecedor = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Fornecedor());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
