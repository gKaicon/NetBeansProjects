package Produto;

import java.util.Date;

/**
 *
 * @author Neusa
 */
public class Produto {

    private static int id;
    private int idproduto;
    private String nome;
    private double preco;
    private String marca;
    private String codigodebarraas;
    private String descrição;
    private Date validade;

    public Produto(String nome, String marca, double preco) {
        this();
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    
    }

    public Produto() {
        Produto.id++;
        this.idproduto = Produto.id;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigodebarraas() {
        return codigodebarraas;
    }

    public void setCodigodebarraas(String codigodebarraas) {
        this.codigodebarraas = codigodebarraas;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

}
