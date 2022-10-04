package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class Fornecedor implements Serializable {

    private Integer Id_Fornecedor;
    private String nome;
    private String telefone;
    private String endereco;

    public Fornecedor() {

    }

    public Integer getId_Fornecedor() {
        return Id_Fornecedor;
    }

    public void setId_Fornecedor(Integer Id_Fornecedor) {
        this.Id_Fornecedor = Id_Fornecedor;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.Id_Fornecedor);
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
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.Id_Fornecedor, other.Id_Fornecedor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
