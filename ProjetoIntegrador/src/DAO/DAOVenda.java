package DAO;

import MODELO.*;
import java.util.Calendar;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class DAOVenda {

    DAOCliente daoCliente = new DAOCliente();
    DAOFuncionario daoFuncionario = new DAOFuncionario();

    public List< Venda> getLista() {
        String sql = "Select * from Venda";
        List<Venda> lista = new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Venda obj = new Venda();
                obj.setId_Venda(rs.getInt("id_Venda"));
                Date dt = rs.getDate("dataVenda");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setData(c);
                obj.setValorTotal(rs.getDouble("valorTotal"));
                obj.setCliente(daoCliente.localizar(rs.getInt("id_Cliente")));
                obj.setFuncionario(daoFuncionario.localizar(rs.getInt("id_Funcionario")));
                lista.add(obj);
            }

        } catch (SQLException ex) {
            System.out.println("SQL Exception" + ex.getMessage());
        }
        return lista;
    }

    public boolean salvar(Venda Venda) {
        if (Venda.getId_Venda() == null) {
            return incluir(Venda);

        } else {
            return alterar(Venda);
        }
    }

    public boolean incluir(Venda obj) {
        String sql = " insert into Venda (id_Cliente, id_Funcionario, dataVenda, valorTotal) values(? , ? , ? , ?) ; ";
        double x = 0;
        obj.setValorTotal(x);
            try {
                PreparedStatement pst = Conexao.getPreparedStatement(sql);
                pst.setInt(1, obj.getCliente().getId_Cliente());
                pst.setInt(2, obj.getFuncionario().getId_Funcionario());
                pst.setDate(3, new Date(obj.getData().getTimeInMillis()));
                pst.setDouble(4, obj.getValorTotal());

                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Venda salva com sucesso");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Venda não foi salva com sucesso");
                    return false;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
                return false;
            }

    }

    public boolean alterar(Venda obj) {
        String sql = "update Venda set id_Cliente = ?, id_Funcionario = ?, dataVenda = ?, valorTotal = ?  where id_Venda = ? ;";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCliente().getId_Cliente());
            pst.setInt(2, obj.getFuncionario().getId_Funcionario());
            pst.setDate(3, new Date(obj.getData().getTimeInMillis()));
            pst.setDouble(4, obj.getValorTotal());
            pst.setInt(5, obj.getId_Venda());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Venda salva com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Venda não foi salva com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;
        }

    }

    public Venda localizar(Integer id) {
        String sql = "select * from Venda where id_Venda = ?;";
        Venda obj = new Venda();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                obj.setId_Venda(rs.getInt("id_Venda"));
                Date dt = rs.getDate("dataVenda");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setData(c);
                obj.setValorTotal(rs.getDouble("valorTotal"));
                obj.setCliente(daoCliente.localizar(rs.getInt("id_Cliente")));
                obj.setFuncionario(daoFuncionario.localizar(rs.getInt("id_Funcionario")));
                return obj;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());

        }
        return null;

    }

    public boolean delete(Venda obj) {
        String sql = "delete from Venda where id_Venda = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getId_Venda());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Venda excluida com sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Venda não foi excluida com sucesso");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
            return false;

        }
    }
}
