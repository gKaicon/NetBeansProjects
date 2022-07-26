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
public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public void imprimeDadosDaArvoreGenealogica() {
        if (pai != null) {
            System.out.println("Nome: " + this.nome + " é filho de: " + pai.getNome());
            pai.imprimeDadosDaArvoreGenealogica();
        }

        if (mae != null) {
            System.out.println("Nome: " + this.nome + " é filho de: " + mae.getNome());
            mae.imprimeDadosDaArvoreGenealogica();
        }

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
}
