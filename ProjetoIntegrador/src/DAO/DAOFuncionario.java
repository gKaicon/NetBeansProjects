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
public class DAOFuncionario {
   
    public List< Funcionario> getLista() {
        String sql = "Select * from Funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Funcionario obj = new Funcionario();
                obj.setId_Funcionario(rs.getInt("id_Funcionario"));
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

    public boolean salvar(Funcionario funcionario) {
        if (funcionario.getId_Funcionario() == null) {
            return incluir(funcionario);

        } else {
            return alterar(funcionario);
        }
    }

    public boolean incluir(Funcionario obj) {
        String sql = " insert into Funcionario (nome, idade, endereco, telefone) values(? , ? , ? , ?) ; ";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getIdade());
            pst.setString(3, obj.getEndereco());
            pst.setString(4, obj.getTelefone());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(Funcionario obj) {
        String sql = "update Funcionario set nome = ?, idade = ?, endereco = ?, telefone = ?  where id_Funcionario = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setInt(2, obj.getIdade());
            pst.setString(3, obj.getEndereco());
            pst.setString(4, obj.getTelefone());
            pst.setInt(5, obj.getId_Funcionario());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não foi salvo com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

        public Funcionario localizar(Integer id) {
        String sql = "select * from Funcionario where id_Funcionario = ?;";
        Funcionario obj = new Funcionario();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Funcionario(rs.getInt("id_Funcionario"));
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

    
    public boolean delete(Funcionario obj) {
        String sql = "delete from Funcionario where id_Funcionario = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Funcionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario não foi excluido com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
