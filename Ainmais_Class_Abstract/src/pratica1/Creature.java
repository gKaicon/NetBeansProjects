/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica1;

/**
 *
 * @author JOSLAINE
 */
abstract public class Creature {
    protected String nome;
    protected String altura;
    
    public abstract String getNome();
    public abstract void setNome(String nome);
}
