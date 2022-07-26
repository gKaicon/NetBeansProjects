
package Numero2;

/**
 *
 * @author Neusa
 */
public class Aluno {

    private static double notas=0;
    private static int quantidadeDeAlunos = 0;
    private String nome;
    private String telefone;
    private String nomePai;
    private String nomeMae;
    private double notasCiênciasHumana;
    private double notasCiênciasNatureza;
    private double notasLinguagensCódigos;
    private double notasMatemática;
    private double notasRedação;
    private double notaMedia;

    public Aluno(String nome, String telefone, String nomePai, String nomeMae, double notasCiênciasHumana, double notasCiênciasNatureza, double notasLinguagensCódigos, double notasMatemática, double notasRedação) {
        this.nome = nome;
        this.telefone = telefone;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.notasCiênciasHumana = notasCiênciasHumana;
        this.notasCiênciasNatureza = notasCiênciasNatureza;
        this.notasLinguagensCódigos = notasLinguagensCódigos;
        this.notasMatemática = notasMatemática;
        this.notasRedação = notasRedação;
        this.notaMedia = (this.notasCiênciasHumana + 
                        this.notasCiênciasNatureza + 
                        this.notasLinguagensCódigos + 
                        this.notasMatemática + 
                        this.notasRedação) / 5.0;
        Aluno.notas += this.notaMedia;
        Aluno.quantidadeDeAlunos++;
    }

    public static double getNotas() {
        return notas;
    }

    public static double getQuantidadeAlunos() {
        return quantidadeDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNomePai() {
        return nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public double getNotasCiênciasHumana() {
        return notasCiênciasHumana;
    }

    public double getNotasCiênciasNatureza() {
        return notasCiênciasNatureza;
    }

    public double getNotasLinguagensCódigos() {
        return notasLinguagensCódigos;
    }

    public double getNotasMatemática() {
        return notasMatemática;
    }

    public double getNotasRedação() {
        return notasRedação;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

}
