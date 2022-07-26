/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author JOSLAINE
 */
public class Pessoa {

    public Pessoa(String nome, String cpf, String nivel_de_escolaridade, String numero_de_telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.nivel_de_escolaridade = nivel_de_escolaridade;
        this.numero_de_telefone = numero_de_telefone;
    }
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String nivel_de_escolaridade;

    public String getNivel_de_escolaridade() {
        return nivel_de_escolaridade;
    }

    public void setNivel_de_escolaridade(String nivel_de_escolaridade) {
        this.nivel_de_escolaridade = nivel_de_escolaridade;
    }
    private String numero_de_telefone;

    public String getNumero_de_telefone() {
        return numero_de_telefone;
    }

    public void setNumero_de_telefone(String numero_de_telefone) {
        this.numero_de_telefone = numero_de_telefone;
    }

}
