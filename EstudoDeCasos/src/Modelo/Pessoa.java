package Modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author KAICON
 */
public class Pessoa implements Serializable {

    private int codigo;
    private String nome;
    private double salario;
    private Calendar nascimento;
    private Cidade cidade;

    public Pessoa() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String dados = "\n|Código:   " + codigo + "\t| Nome:   " + nome + "\t| Salario:   " + salario
                     + "\t| Nascimento:   " + nascimento + "\t| Reside na Cidade de:   " + cidade.getNome()+"| "+"   ";

        return dados;
    }

}
