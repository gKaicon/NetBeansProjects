package DAO;

import MODELO.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOFornecedor {

    public boolean salvar(Fornecedor fornecedor) {
        if (fornecedor.getId_Fornecedor() == null) {

            int idLocal = BancoDados.ListaFornecedor.size() + 1;

            fornecedor.setId_Fornecedor(idLocal);
            BancoDados.ListaFornecedor.add(fornecedor);

        } else {

            int indice = BancoDados.ListaFornecedor.indexOf(fornecedor);

            Fornecedor aux = BancoDados.ListaFornecedor.get(indice);

            aux.setNome(fornecedor.getNome());
            aux.setEndereco(fornecedor.getEndereco());
            aux.setTelefone(fornecedor.getTelefone());

        }
        return true;
    }

    public ArrayList< Fornecedor> getLista() {
        return BancoDados.ListaFornecedor;
    }

    public boolean delete(Fornecedor fornecedor) {

        BancoDados.ListaFornecedor.remove(fornecedor);
        return true;
    }
}
