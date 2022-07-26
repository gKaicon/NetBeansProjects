package DAO;

import Modelo.*;

import java.util.ArrayList;

/**
 *
 * @author KAICON
 */
public class DAOCidade {
//Create

    public boolean create(Cidade cidade) {
        BD.Listacidades.add(cidade);
        return true;
    }
//Update

    public boolean salvar(Cidade cidade) {
        if (cidade.getCodigo() == 0) {
            int codigo = BD.Listacidades.size() + 1;
            cidade.setCodigo(codigo);
            BD.Listacidades.add(cidade);
        } else {
            int i = BD.Listacidades.indexOf(cidade);
            Cidade aux = BD.Listacidades.get(i);
            
            aux.setNome(cidade.getNome());
            aux.setUf(cidade.getUf());
            
        }
        return true;
    }
//Read

    public ArrayList<Cidade> getLista() {
        return BD.Listacidades;
    }
//Delete

    public boolean delete(Cidade cidade) {
        BD.Listacidades.remove(cidade);
        return true;
    }
}
