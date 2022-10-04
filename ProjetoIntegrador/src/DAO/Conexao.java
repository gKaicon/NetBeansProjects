package DAO;

/**
 *
 * @author KAICON
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexao {

    private static final String banco = "jdbc:mysql://localhost:3306/ProjetoIntegrador";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String usuario = "root";
    private static final String senha = "GabrielK@!c0n21";
    private static Connection con = null;

    public Conexao() {

    }

    public static Connection getConexao() {
        if (con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o Driver");
            } catch (SQLException ex) {
                System.out.println("SQL Exception: " + ex.getMessage());
            }
        }
        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql){
        if (con == null) {
            con = getConexao();
        }try{
            return  con.prepareStatement(sql);
        }catch(SQLException ex){
            System.out.println("SQL Exception" + ex.getMessage());
        }
            return null;
    }
}
