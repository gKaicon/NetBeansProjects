package pacoteTeste;

import exercicios.Conta;

/**
 *
 * @author Neusa
 */
public class ContaCorrente extends Conta {
//    public void ContaCorrente{
//    super();
//}

    public void alteraGerente(String nome) {
        this.gerente = nome;
    }

    String Dados() {
        
        String dados;
        
        dados = this.gerente;
        
        return dados;
    }
}
