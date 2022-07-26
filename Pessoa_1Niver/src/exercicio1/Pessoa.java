/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author JOSLAINE
 */
public class Pessoa extends Main {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setfazAniversario(int idade) {
        this.idade += idade;
        idade++;

    }

    public int getfazAniversario(int idade) {
        idade++;
        return idade;

    }

}
