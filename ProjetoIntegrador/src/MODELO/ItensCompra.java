package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class ItensCompra implements Serializable {

    private Integer id_ItensCompra;
    private Produto produto;
    private Compra compra;
    private Integer qntd;
    private double PrecoCompra;
    private double Subtotal;

    public ItensCompra() {
    }

    public ItensCompra(Compra compra) {
        this.compra = compra;
    }

    public Integer getId_ItensCompra() {
        return id_ItensCompra;
    }

    public void setId_ItensCompra(Integer id_ItensCompra) {
        this.id_ItensCompra = id_ItensCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto Produto) {
        this.produto = Produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Integer getQntd() {
        return qntd;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public double getSubtotal() {
        if (produto != null) {
            return this.Subtotal = this.produto.getPrecoVenda();
        }
        return this.Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getPrecoCompra() {
        if (produto != null && this.getQntd() >= 1) {
            return this.PrecoCompra = (this.produto.getPrecoVenda() * this.getQntd());
        }
        return PrecoCompra;
    }

    public void setPrecoCompra(double PrecoCompra) {
        this.PrecoCompra = PrecoCompra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id_ItensCompra);
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
        final ItensCompra other = (ItensCompra) obj;
        if (!Objects.equals(this.id_ItensCompra, other.id_ItensCompra)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Compra:" + compra.getId_Compra() + "\nId_ItensCompra:  " + id_ItensCompra + "\nProduto: " + produto.getNome() + " - R$ " + produto.getPrecoCusto()
                + "\nQntd:  " + qntd + "\nPrecoCompra:  " + PrecoCompra + "\nSubtotal:  " + Subtotal + "\n";

    }

}
