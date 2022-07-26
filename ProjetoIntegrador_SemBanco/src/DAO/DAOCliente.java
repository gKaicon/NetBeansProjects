package DAO;

import MODELO.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOCliente {

    public boolean salvar(Cliente cliente) {
        if (cliente.getId_Cliente() == null) {
            int idLocal = BancoDados.ListaCliente.size() + 1;
            cliente.setId_Cliente(idLocal);
            BancoDados.ListaCliente.add(cliente);

        } else {

            int indice = BancoDados.ListaCliente.indexOf(cliente);
            Cliente aux = BancoDados.ListaCliente.get(indice);
            aux.setNome(cliente.getNome());
            aux.setEndereco(cliente.getEndereco());
            aux.setTelefone(cliente.getTelefone());
            aux.setIdade(cliente.getIdade());

        }
        return true;
    }

    public ArrayList< Cliente> getLista() {
        return BancoDados.ListaCliente;
    }

    public boolean delete(Cliente cliente) {
        BancoDados.ListaCliente.remove(cliente);
        return true;
    }
}
