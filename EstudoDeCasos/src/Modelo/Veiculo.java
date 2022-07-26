package Modelo;

import java.io.Serializable;

/**
 *
 * @author JOSLAINE
 */
public class Veiculo implements Serializable {

    private int codigo;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String chassi;
    private Pessoa pessoa;

    public Veiculo() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
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
        final Veiculo other = (Veiculo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
      String dados = "\nProprietário:\t" + pessoa.getNome()+" \n\tVeiculo:" + "| \tCodigo:\t" + codigo + "| \tMarca:\t" + marca + "| \tModelo:\t" + modelo 
              + "| \tAno:" + ano + "| \tCor:\t" + cor + "| \tPlaca:\t" + placa + "| \tChassi:\t" + chassi 
              + "\n\n";  
        return dados;
    }
    
}
