package DAO;

import MODELO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author KAICON
 */
public class DAOItensVenda {

    public boolean salvar(ItensVenda itensVenda) {
        if (itensVenda.getId_ItensVenda() == null) {
            int idLocal = BancoDados.ListaItensVenda.size() + 1;
            itensVenda.setId_ItensVenda(idLocal);
            BancoDados.ListaItensVenda.add(itensVenda);
        } else {
            int indice = BancoDados.ListaItensVenda.indexOf(itensVenda);
            ItensVenda aux = BancoDados.ListaItensVenda.get(indice);
            aux.setProduto(itensVenda.getProduto());
            aux.setQntd(itensVenda.getQntd());

        }

        return true;
    }

    public ArrayList<ItensVenda> getLista() {
        return BancoDados.ListaItensVenda;
    }
    public List<ItensVenda> getListaPorVenda(Venda venda) {  
        return BancoDados.ListaItensVenda.stream().filter(v->v.getVenda().equals(venda)).collect(Collectors.toList());
    }

    public boolean delete(ItensVenda itensVenda) {
        return BancoDados.ListaItensVenda.remove(itensVenda);
    }
}
