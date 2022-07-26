/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_1;

/**
 *
 * @author 0048609
 */
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa kaicon = new Pessoa();
        Pessoa pai = new Pessoa("Marcelo", 46);
        Pessoa mae = new Pessoa("Joslaine", 42);
        Pessoa filho = new Pessoa("Kaicon", 16);
        Pessoa voM = new Pessoa("José", 85);
        Pessoa voaM = new Pessoa("Neuza", 72);
        Pessoa voP = new Pessoa("Luiz", 85);
        Pessoa voaP = new Pessoa("Jupira", 72);
        Pessoa boMP = new Pessoa("Nicolau", 96);
        Pessoa boaM = new Pessoa("Marieta", 72);

        filho.setMae(mae);
        filho.setPai(pai);
        mae.setMae(voaM);
        mae.setPai(voM);
        pai.setMae(voP);
        pai.setPai(voaP);

        filho.imprimeDadosDaArvoreGenealogica();
        
        // TODO code application logic here
    }

}
