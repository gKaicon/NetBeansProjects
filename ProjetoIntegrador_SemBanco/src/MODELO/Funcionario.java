package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class Funcionario implements Serializable {

    private Integer Id_Funcionario;
    private String nome;
    private String telefone;
    private String endereco;
    private Integer idade;

    public Funcionario() {
    }

    public Integer getId_Funcionario() {
        return Id_Funcionario;
    }

    public void setId_Funcionario(Integer Id_Funcionario) {
        this.Id_Funcionario = Id_Funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.Id_Funcionario);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.Id_Funcionario, other.Id_Funcionario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nome;
    }

}
