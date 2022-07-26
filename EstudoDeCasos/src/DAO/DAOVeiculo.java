package DAO;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author JOSLAINE
 */
public class DAOVeiculo {
    //Create

    public boolean create(Veiculo veiculo) {
        BD.Listaveiculos.add(veiculo);
        return true;
    }

    public boolean salvar(Veiculo veiculo) {
        if (veiculo.getCodigo() == 0) {
            int codigo = BD.Listaveiculos.size() + 1;
            veiculo.setCodigo(codigo);
            BD.Listaveiculos.add(veiculo);
        } //Update
        else {
            int i = BD.Listaveiculos.indexOf(veiculo);
            Veiculo aux = BD.Listaveiculos.get(i);

            aux.setMarca(veiculo.getMarca());
            aux.setModelo(veiculo.getModelo());
            aux.setAno(veiculo.getAno());
            aux.setCor(veiculo.getCor());
            aux.setPlaca(veiculo.getPlaca());
            aux.setChassi(veiculo.getChassi());
            aux.setPessoa(veiculo.getPessoa());
        }
        return true;
    }
//Read

    public ArrayList<Veiculo> getLista() {
        return BD.Listaveiculos;
    }
//Delete

    public boolean delete(Veiculo veiculo) {
        BD.Listaveiculos.remove(veiculo);
        return true;
    }

}
