package DAO;

import MODELO.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOCompra {

    public boolean salvar(Compra compra) {
        if (compra.getId_Compra() == null) {

            int idLocal = BancoDados.ListaCompra.size() + 1;

            compra.setId_Compra(idLocal);
            BancoDados.ListaCompra.add(compra);

        } else {

            int indice = BancoDados.ListaCompra.indexOf(compra);

            Compra aux = BancoDados.ListaCompra.get(indice);

            aux.setData(compra.getData());
            aux.setFuncionario(compra.getFuncionario());
            aux.setValorTotal(compra.getValorTotal());
            aux.setFornecedor(compra.getFornecedor());

        }
        return true;
    }

    public ArrayList< Compra> getLista() {
        return BancoDados.ListaCompra;
    }

    public boolean delete(Compra compra) {

        BancoDados.ListaCompra.remove(compra);
        return true;
    }
}
