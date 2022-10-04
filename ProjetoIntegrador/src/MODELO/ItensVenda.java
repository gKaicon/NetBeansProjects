package MODELO;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author KAICON
 */
public class ItensVenda implements Serializable {

    private Integer id_ItensVenda;
    private Venda venda;
    private Produto produto;
    private int qntd;
    private double PrecoVenda;
    private double Subtotal;

    public ItensVenda() {
    }

    public ItensVenda(Venda venda) {
        this.venda = venda;
    }

    public Integer getId_ItensVenda() {
        return id_ItensVenda;
    }

    public void setId_ItensVenda(Integer id_ItensVenda) {
        this.id_ItensVenda = id_ItensVenda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto Produto) {
        this.produto = Produto;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public double getPrecoVenda() {
        if (produto != null && this.getQntd() >= 1) {
            return this.PrecoVenda = (this.produto.getPrecoVenda() * this.getQntd());
        }
        return PrecoVenda;
    }

    public void setPrecoVenda(double PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public double getSubtotal() {
        if (produto != null) {
            return this.Subtotal = this.produto.getPrecoVenda();
        }
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id_ItensVenda);
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
        final ItensVenda other = (ItensVenda) obj;
        if (!Objects.equals(this.id_ItensVenda, other.id_ItensVenda)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID da Venda: " + venda.getId_Venda() + "\nId_ItensVenda:  " + id_ItensVenda + "\nProduto: " + produto.getNome()
                + "\nQntd:  " + qntd + "\nPrecoVenda:  " + PrecoVenda + "\nSubtotal:  " + Subtotal + "\n\n";
    }

}
