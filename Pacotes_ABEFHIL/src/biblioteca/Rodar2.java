/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author 0048609
 */
public class Rodar2 {

    public static void main(String[] args) {
        Cliente xCliente;
        xCliente = new Cliente();
        xCliente.setNome("Kaicon");
        xCliente.setTelefone("33 9 8878 3908");
        Livro xLivro;
        xLivro = new Livro();
        xLivro.setNome_Livro(" A sutil arte de ligar o Foda-se ");
        xLivro.setCod("10106");
        Agenda xAgenda;
        xAgenda = new Agenda();
        xAgenda.setData_de_emissao("02/10/2019");
        xAgenda.setData_de_entrega("09/10/2019");
        System.out.println("Nome: " + xCliente.getNome() + "\nNumero de telefone: " + xCliente.getTelefone());
        System.out.println("Livro de nome: " + xLivro.getNome_Livro() + "\nCodigo: " + xLivro.getCod());
        System.out.println("Data de emissao: " + xAgenda.getData_de_emissao() + "\nData de entrega: " + xAgenda.getData_de_entrega());

    }

}
