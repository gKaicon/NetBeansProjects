package Numero1;

import java.util.ArrayList;

/**
 *
 * @author Neusa
 */
public class Contato {

    private String nome;
    private String endereco;
    private ArrayList<String> ListaTelefone;
    private ArrayList<String> ListaEmail;

    public Contato(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        ListaTelefone = new ArrayList<>();
        ListaEmail = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void insereTelefone(String novo) {
        ListaTelefone.add(novo);
    }

    public void addEmail(String news) {
        ListaEmail.add(news);
    }

    @Override
    public String toString() {
        String contato = "Contato{" + "nome=" + nome + ", endereco=" + endereco + '}';
        contato += "\nLista de email:\t";

        for (String email : ListaEmail) {
            return contato += email;
        }
        contato += "\nLista de telefone:\t";

        for (String telefone : ListaTelefone) {
            return contato += telefone;
        }
        return contato + "\n";
    }

}
