/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author 0048609
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contato xContato;
        xContato=new Contato();
        xContato.setNome("Kaicon");
        xContato.setTelefone("33 9 8878 3908");
        System.out.println("Nome "+xContato.getNome()
        + "\nNumero de telefone "+ xContato.getTelefone());
        
        System.out.println("\n");
        
        xContato=new Contato();
        xContato.setNome("Tonho");
        xContato.setTelefone("33 9 8770 7070");
        System.out.println("Nome "+xContato.getNome()
        + "\nNumero de telefone "+ xContato.getTelefone());
    }
    
}
