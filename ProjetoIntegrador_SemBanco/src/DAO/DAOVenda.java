package DAO;

import MODELO.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOVenda {

    public boolean salvar(Venda venda) {
        if (venda.getId_Venda() == null) {

            int idLocal = BancoDados.ListaVenda.size() + 1;

            venda.setId_Venda(idLocal);
            BancoDados.ListaVenda.add(venda);

        } else {

            int indice = BancoDados.ListaVenda.indexOf(venda);

            Venda aux = BancoDados.ListaVenda.get(indice);

            aux.setCliente(venda.getCliente());
            aux.setData(venda.getData());
            aux.setValorTotal(venda.getValorTotal());
            aux.setFuncionario(venda.getFuncionario());

        }
        return true;
    }

    public ArrayList< Venda> getLista() {
        return BancoDados.ListaVenda;
    }

    public boolean delete(Venda venda) {

        BancoDados.ListaVenda.remove(venda);
        return true;
    }
}
