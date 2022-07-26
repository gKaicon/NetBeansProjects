package DAO;

import MODELO.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOFuncionario {

    public boolean salvar(Funcionario funcionario) {
        if (funcionario.getId_Funcionario() == null) {

            int idLocal = BancoDados.ListaFuncionario.size() + 1;

            funcionario.setId_Funcionario(idLocal);
            BancoDados.ListaFuncionario.add(funcionario);

        } else {

            int indice = BancoDados.ListaFuncionario.indexOf(funcionario);

            Funcionario aux = BancoDados.ListaFuncionario.get(indice);

            aux.setNome(funcionario.getNome());
            aux.setEndereco(funcionario.getEndereco());
            aux.setTelefone(funcionario.getTelefone());
            aux.setIdade(funcionario.getIdade());

        }
        return true;
    }

    public ArrayList< Funcionario> getLista() {
        return BancoDados.ListaFuncionario;
    }

    public boolean delete(Funcionario funcionario) {

        BancoDados.ListaFuncionario.remove(funcionario);
        return true;
    }
}
