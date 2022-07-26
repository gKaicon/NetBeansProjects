package MODELO;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class BancoDados implements Serializable {

    public static ArrayList<Cliente> ListaCliente = new ArrayList<>();
    public static ArrayList<Compra> ListaCompra = new ArrayList<>();
    public static ArrayList<Fornecedor> ListaFornecedor = new ArrayList<>();
    public static ArrayList<Funcionario> ListaFuncionario = new ArrayList<>();
    public static ArrayList<ItensVenda> ListaItensVenda = new ArrayList<>();
    public static ArrayList<ItensCompra> ListaItensCompra = new ArrayList<>();
    public static ArrayList<Produto> ListaProduto = new ArrayList<>();
    public static ArrayList<Venda> ListaVenda = new ArrayList<>();

}
