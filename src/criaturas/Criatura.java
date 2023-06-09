package criaturas;


import java.util.Random;

public abstract class Criatura {
    private final int poder;
    private final int ataque;
    private final int defesa;
    private final int velocidade;
    private final int pontosDeVida;
    private int vida;

    public Criatura() {
        this.poder = Criatura.generateRandomNumber(10, 30);
        this.ataque = Criatura.generateRandomNumber(5, 15);
        this.defesa = Criatura.generateRandomNumber(5, 15);
        this.velocidade = Criatura.generateRandomNumber(1, 10);

        int vida = Criatura.generateRandomNumber(200, 400);
        this.pontosDeVida = vida;
        this.vida = vida;
    }

    private static int generateRandomNumber(int from, int to) {
        Random r = new Random();
        return r.nextInt(to + 1 - from) + from;
    }

    private int getPoder() {
        return poder;
    }

    private int getAtaque() {
        return ataque;
    }

    private int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void resetaVida() {
        this.vida = this.pontosDeVida;
    }

    public abstract int getAtaqueElemetal(Criatura defensor);

    public abstract String getEspecie();

    public int getAtaqueFisico(Criatura criatura) {
        return this.getPoder() * this.getAtaque() / criatura.getDefesa();
    }

    public void recebeDano(int dano) {
        this.vida -= dano;
    }
}
