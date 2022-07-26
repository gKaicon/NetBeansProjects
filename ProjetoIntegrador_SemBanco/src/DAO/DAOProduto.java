package DAO;

import MODELO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KAICON
 */
public class DAOProduto {

    public boolean salvar(Produto produto) {
        if (produto.getId_Produto() == null) {
            int idLocal = BancoDados.ListaProduto.size() + 1;
            produto.setId_Produto(idLocal);
            BancoDados.ListaProduto.add(produto);
        } else {
            int indice = BancoDados.ListaProduto.indexOf(produto);

            Produto aux = BancoDados.ListaProduto.get(indice);

            aux.setNome(produto.getNome());
            aux.setPrecoCusto(produto.getPrecoCusto());
            aux.setUnidade(produto.getUnidade());
            aux.setFornecedor(produto.getFornecedor());
        }

        return true;
    }

    public ArrayList<Produto> getLista() {

        return BancoDados.ListaProduto;
    }

    public void atualizaEstoqueCompra(Produto produto, int qntd) {
        
        produto.setUnidade(produto.getUnidade() + qntd);

    }

    public void atualizaEstoqueVenda(Produto produto, int qntd) {
        if(produto.getUnidade() > (qntd) ){
            produto.setUnidade(qntd - produto.getUnidade());
        }else{
        JOptionPane.showMessageDialog(null, "O produto foi salvo, mas não foi vendido");
        }
    }

    public boolean delete(Produto produto) {
        return BancoDados.ListaProduto.remove(produto);
    }
}
