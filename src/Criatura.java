public class Criatura {
    private String nome;
    private int ataque;
    private int poder;
    private int velocidade;
    private int defesa;
    private int pontosDeVida;
    private String ataqueElemental;

    public Criatura(String nome, int ataque, int poder, int velocidade, int defesa, int pontosDeVida, String ataqueElemental) {
        this.nome = nome;
        this.ataque = ataque;
        this.poder = poder;
        this.velocidade = velocidade;
        this.defesa = defesa;
        this.pontosDeVida = pontosDeVida;
        this.ataqueElemental = ataqueElemental;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public String getAtaqueElemental() {
        return ataqueElemental;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setAtaqueElemental(String ataqueElemental) {
        this.ataqueElemental = ataqueElemental;
    }
}
