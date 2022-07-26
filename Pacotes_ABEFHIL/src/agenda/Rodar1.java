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
public class Rodar1 {
    public static void main(String[] args) {
         Contato xContato;
        xContato=new Contato();
        xContato.setNome("Kaicon");
        xContato.setTelefone("33 9 8878 3908");
        Endereco xEndereco;
        xEndereco=new Endereco();
        xEndereco.setRua(" das flores");
        xEndereco.setNum("101");
        xEndereco.setBairro("Pombal");
        System.out.println("Nome "+xContato.getNome()
        + "\nNumero de telefone "+ xContato.getTelefone());
        System.out.println("Rua"+xEndereco.getRua()+" ,"+xEndereco.getNum()+"\nBairro:"+xEndereco.getBairro());
        
    }
}
