package DistribuidoraVLFH;

import DAO.*;
import MODELO.*;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author KAICON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]Args) {

        DAOCliente daoCliente = new DAOCliente();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        DAOFuncionario daoFuncionario = new DAOFuncionario();
        DAOProduto daoProduto = new DAOProduto();
        DAOCompra daoCompra = new DAOCompra();
        DAOVenda daoVenda = new DAOVenda();
        DAOItensCompra daoItensCompra = new DAOItensCompra();
        DAOItensVenda daoItensVenda = new DAOItensVenda();

        Cliente cc = new Cliente();
        cc.setNome("Aleixo");
        cc.setEndereco("Rua Z");
        cc.setIdade(18);
        cc.setTelefone("33988782141");
        daoCliente.salvar(cc);

        Cliente cc2 = new Cliente();
        cc2.setNome("Kaicon");
        cc2.setEndereco("Rua Y");
        cc2.setIdade(19);
        cc2.setTelefone("33988782141");
        daoCliente.salvar(cc2);

        Cliente cc3 = new Cliente();
        cc3.setNome("Antonio");
        cc3.setEndereco("Rua X");
        cc3.setIdade(14);
        cc3.setTelefone("33988782141");
        daoCliente.salvar(cc3);
// Forncecedor
        Fornecedor ff = new Fornecedor();
        ff.setNome("João");
        ff.setEndereco("Rua Y");
        ff.setTelefone("33988782141");
        daoFornecedor.salvar(ff);

        Fornecedor ff2 = new Fornecedor();
        ff2.setNome("Juca");
        ff2.setEndereco("Rua X");
        ff2.setTelefone("33988782141");
        daoFornecedor.salvar(ff2);

        Fornecedor ff3 = new Fornecedor();
        ff3.setNome("Jairo");
        ff3.setEndereco("Rua X");
        ff3.setTelefone("33988782141");
        daoFornecedor.salvar(ff3);
// Funcionario        
        Funcionario ffu = new Funcionario();
        ffu.setNome("Jonas");
        ffu.setEndereco("Rua X");
        daoFuncionario.salvar(ffu);

        Funcionario ffu2 = new Funcionario();
        ffu2.setNome("Jorel");
        ffu2.setEndereco("Rua X");
        daoFuncionario.salvar(ffu2);

        Funcionario ffu3 = new Funcionario();
        ffu3.setNome("Jaime");
        ffu3.setEndereco("Rua X");
        daoFuncionario.salvar(ffu3);

//Cadastro de Produtos
        Produto pp = new Produto();
        pp.setNome("Arroz");
        pp.setPrecoCusto(17.9);
        pp.setFornecedor(ff3);
        pp.setUnidade(100);
        daoProduto.salvar(pp);

        Produto pp2 = new Produto();
        pp2.setNome("Feijão");
        pp2.setPrecoCusto(13.9);
        pp2.setFornecedor(ff3);
        pp2.setUnidade(1);
        daoProduto.salvar(pp2);

        Produto pp3 = new Produto();
        pp3.setNome("Batata");
        pp3.setPrecoCusto(7.8);
        pp3.setFornecedor(ff3);
        pp3.setUnidade(1);
        daoProduto.salvar(pp3);

        Produto pp4 = new Produto();
        pp4.setNome("Tomate");
        pp4.setPrecoCusto(8.7);
        pp4.setFornecedor(ff3);
        pp4.setUnidade(1);
        daoProduto.salvar(pp4);

        Produto pp5 = new Produto();
        pp5.setNome("Maçã");
        pp5.setPrecoCusto(12.2);
        pp5.setFornecedor(ff3);
        pp5.setUnidade(1);
        daoProduto.salvar(pp5);

        Produto pp6 = new Produto();
        pp6.setNome("Laranja");
        pp6.setPrecoCusto(6.5);
        pp6.setFornecedor(ff3);
        pp6.setUnidade(1);
        daoProduto.salvar(pp6);

        Venda v = new Venda();       
        Date d = new Date(110,3, 11);
        v.setData(Calendar.getInstance());
        System.out.println(v.getData());
    }
}
