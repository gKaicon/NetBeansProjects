package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class Cliente implements Serializable {

    private Integer Id_Cliente;
    private String nome;
    private String telefone;
    private String endereco;
    private Integer idade;

    public Cliente() {

    }

    public Integer getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(Integer Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Id_Cliente);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.Id_Cliente, other.Id_Cliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nome;
    }

}
