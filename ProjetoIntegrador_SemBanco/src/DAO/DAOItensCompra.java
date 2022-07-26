package DAO;

import MODELO.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author KAICON
 */
public class DAOItensCompra {

    public boolean salvar(ItensCompra itensCompra) {
        if (itensCompra.getId_ItensCompra() == null) {
            int idLocal = BancoDados.ListaItensCompra.size() + 1;
            itensCompra.setId_ItensCompra(idLocal);
            BancoDados.ListaItensCompra.add(itensCompra);
        } else {
            int indice = BancoDados.ListaItensCompra.indexOf(itensCompra);
            ItensCompra aux = BancoDados.ListaItensCompra.get(indice);
            aux.setProduto(itensCompra.getProduto());
            aux.setQntd(itensCompra.getQntd());

        }

        return true;
    }

    public ArrayList<ItensCompra> getLista() {
        return BancoDados.ListaItensCompra;
    }
    
   public List<ItensCompra> getListaPorCompra(Compra compra) {
        return BancoDados.ListaItensCompra.stream().filter(c -> c.getCompra().equals(compra)).collect(Collectors.toList());
    }

    public boolean delete(ItensCompra itensCompra) {
        return BancoDados.ListaItensCompra.remove(itensCompra);
    }
}
