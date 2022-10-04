package DAO;

import MODELO.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author KAICON
 */
public class DAOCompra {

    DAOFuncionario daoFuncionario = new DAOFuncionario();
    DAOFornecedor daoFornecedor = new DAOFornecedor();

    public List< Compra> getLista() {
        String sql = "Select * from Compra";
        List<Compra> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Compra obj = new Compra();
                obj.setId_Compra(rs.getInt("id_Compra"));
                Date dt = rs.getDate("dataCompra");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setData(c);
                obj.setValorTotal(rs.getDouble("valorTotal"));
                obj.setFornecedor(daoFornecedor.localizar(rs.getInt("id_Fornecedor")));
                obj.setFuncionario(daoFuncionario.localizar(rs.getInt("id_Funcionario")));
                obj.setValorTotal(rs.getDouble("valorTotal"));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(Compra compra) {
        if (compra.getId_Compra() == null) {
            return incluir(compra);

        } else {
            return alterar(compra);
        }
    }

    public boolean incluir(Compra obj) {
        String sql = " insert into Compra (id_Fornecedor, id_Funcionario, dataCompra, valorTotal) values(? , ? , ? , ?) ; ";
        double x = 0;
        obj.setValorTotal(x);
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            pst.setInt(2, obj.getFuncionario().getId_Funcionario());
            pst.setDate(3, new Date(obj.getData().getTimeInMillis()));
            pst.setDouble(4, obj.getValorTotal());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Compra salva com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Compra não foi salva com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public boolean alterar(Compra obj) {
        String sql = "update Compra set id_Fornecedor = ?, id_Funcionario = ?, dataCompra = ?, valorTotal = ?  where id_Compra = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getFornecedor().getId_Fornecedor());
            pst.setInt(2, obj.getFuncionario().getId_Funcionario());
            pst.setDate(3, new Date(obj.getData().getTimeInMillis()));
            pst.setDouble(4, obj.getValorTotal());
            pst.setInt(5, obj.getId_Compra());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Compra salva com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Compra não foi salva com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public Compra localizar(Integer id) {
        String sql = "select * from Compra where id_Compra = ?;";
        Compra obj = new Compra();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Compra(rs.getInt("id_Compra"));
                Date dt = rs.getDate("dataCompra");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setData(c);
                obj.setValorTotal(rs.getDouble("valorTotal"));
                obj.setFornecedor(daoFornecedor.localizar(rs.getInt("id_Fornecedor")));
                obj.setFuncionario(daoFuncionario.localizar(rs.getInt("id_Funcionario")));
                obj.setValorTotal(rs.getDouble("valorTotal"));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
        return null;

    }

    public boolean delete(Compra obj) {
        String sql = "delete from Compra where id_Compra = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Compra());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Compra excluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Compra não foi excluida com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
