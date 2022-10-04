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
public class DAOCliente {

    public List< Cliente> getLista() {
        String sql = "Select * from Cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente obj = new Cliente();
                obj.setId_Cliente(rs.getInt("id_Cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setIdade(rs.getInt("idade"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setTelefone(rs.getString("telefone"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(Cliente cliente) {
        if (cliente.getId_Cliente() == null) {
            return incluir(cliente);

        } else {
            return alterar(cliente);
        }
    }

    public boolean incluir(Cliente obj) {
        String sql = " insert into Cliente (nome, idade, endereco, telefone) values(? , ? , ? , ?) ; ";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getIdade());
            pst.setString(3, obj.getEndereco());
            pst.setString(4, obj.getTelefone());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(Cliente obj) {
        String sql = "update Cliente set nome = ?, idade = ?, endereco = ?, telefone = ?  where id_Cliente = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getIdade());
            pst.setString(3, obj.getEndereco());
            pst.setString(4, obj.getTelefone());
            pst.setInt(5, obj.getId_Cliente());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public Cliente localizar(Integer id) {
        String sql = "select * from Cliente where id_Cliente = ?;";
        Cliente obj = new Cliente();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Cliente(rs.getInt("id_Cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setIdade(rs.getInt("idade"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setTelefone(rs.getString("telefone"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }

    public boolean delete(Cliente obj) {
        String sql = "delete from cliente where id_Cliente = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Cliente());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
