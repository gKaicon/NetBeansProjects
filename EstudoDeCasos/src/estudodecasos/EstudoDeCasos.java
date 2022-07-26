package estudodecasos;

import Modelo.*;
import DAO.*;

/**
 *
 * @author KAICON
 */
public class EstudoDeCasos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DAOCidade daocidade = new DAOCidade();
        DAOPessoa daopessoa = new DAOPessoa();
        DAOVeiculo daoveiculo = new DAOVeiculo();

//Cidades
        Cidade um = new Cidade();
        um.setNome("BH");
        daocidade.salvar(um);

        Cidade dois = new Cidade();
        dois.setNome("SJE");
        daocidade.salvar(dois);

        Cidade tres = new Cidade();
        tres.setNome("GH");
        daocidade.salvar(tres);
        
        Cidade quatro = new Cidade();
        quatro.setNome("PEC");
        daocidade.salvar(quatro);
        
        Cidade cinco = new Cidade();
        cinco.setCodigo(4);
        cinco.setNome("Roça");
        daocidade.salvar(cinco);
        
        Cidade seis = new Cidade();
        seis.setCodigo(4);
        seis.setNome("Peçanha");
        daocidade.salvar(seis);
//Pessoas e veiculo referente
        //Vito
        Pessoa vito = new Pessoa();
        vito.setNome("Vito");
        vito.setCidade(um);
        daopessoa.salvar(vito);

        Veiculo corcel = new Veiculo();
        corcel.setModelo("Corcel II");
        corcel.setMarca("Ford");
        corcel.setPessoa(vito);
        daoveiculo.salvar(corcel);

        Veiculo porsche = new Veiculo();
        porsche.setModelo("911 Carrera S");
        porsche.setMarca("Porsche");
        porsche.setPessoa(vito);
        daoveiculo.salvar(porsche);

        //kainen
        Pessoa kainen = new Pessoa();
        kainen.setNome("Kainen");
        kainen.setCidade(um);
        daopessoa.salvar(kainen);

        Veiculo porsche1 = new Veiculo();
        porsche1.setModelo("Carrera GT");
        porsche1.setPessoa(kainen);
        porsche1.setMarca("Porsche");
        daoveiculo.salvar(porsche1);

        Veiculo porsche2 = new Veiculo();
        porsche2.setModelo("Cayaman S");
        porsche2.setPessoa(kainen);
        porsche2.setMarca("Porsche");
        daoveiculo.salvar(porsche2);

        //Cidades
        System.out.println("Cidades:\n"+daocidade.getLista()+"\n");
        //Pessoas
        System.out.println("Pessoas:\n"+daopessoa.getLista()+"\n");
        //Veiculos
        System.out.println("Veiculos:\n"+daoveiculo.getLista()+"\n");

    }

}
