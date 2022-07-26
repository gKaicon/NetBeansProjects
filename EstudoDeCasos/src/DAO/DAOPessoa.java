package DAO;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOPessoa {

    public ArrayList<Pessoa> getLista() {
        return BD.Listapessoas;
    }

    public boolean salvar(Pessoa pessoas) {
        if (pessoas.getCodigo() == 0) {
            int codigo = BD.Listapessoas.size() + 1;
            pessoas.setCodigo(codigo);
            BD.Listapessoas.add(pessoas);
        } else {
            int i = BD.Listapessoas.indexOf(pessoas);
            Pessoa aux = BD.Listapessoas.get(i);
            aux.setNome(pessoas.getNome());
            aux.setSalario(pessoas.getSalario());
            aux.setNascimento(pessoas.getNascimento());
            aux.setCidade(pessoas.getCidade());

        }

        return true;
    }

    public boolean remover(Pessoa pessoa) {
        BD.Listapessoas.remove(pessoa);
        return true;
    }
}
