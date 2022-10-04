package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class Produto implements Serializable {

    private Integer Id_Produto;
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private Integer unidade;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Integer getId_Produto() {
        return Id_Produto;
    }

    public void setId_Produto(Integer Id_Produto) {
        this.Id_Produto = Id_Produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda = (50 * this.getPrecoCusto()) / 100 + this.getPrecoCusto();
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.Id_Produto);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.Id_Produto, other.Id_Produto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Id_Produto + "-" + nome;
    }

}
