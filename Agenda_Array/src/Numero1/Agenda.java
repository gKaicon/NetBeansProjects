package Numero1;

import java.util.ArrayList;

/**
 *
 * @author Neusa
 */
public class Agenda {

    private ArrayList<Contato> ListaContatos;

    public Agenda() {
        ListaContatos = new ArrayList<>();
    }

    public void addConatto(Contato novo) {
        ListaContatos.add(novo);
    }

    public Contato pesquisaConato(String nome) {
        for (Contato contato : ListaContatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void RemoveContato(String nome) {
        ListaContatos.remove(this.pesquisaConato(nome));
    }

    public void Listacontato() {
        
        for (Contato listar : ListaContatos) {
            System.out.println(listar.getNome());

        }
    }
}
