package pratica1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0048609
 */
public class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private double peso;

    public double getPeso() {

        return peso;
    }

    public double getPesoGramas() {
        double gram = 1000;
        return peso * gram;
    }

    public void setPeso(double newPeso) {
        if (newPeso > 0) {
            peso = newPeso;
        } else {
            System.out.println("Error!");
        }
        this.peso = peso;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private String favComida;

    public String getFavComida() {
        return favComida;
    }

    public void setFavComida(String favComida) {
        this.favComida = favComida;
    }

    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
