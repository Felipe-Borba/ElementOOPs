import criaturas.Criatura;

public class Main {
    public static void main(String[] args) {
        Menu.novoJogo();
        Criatura jogador = Menu.selecionaCriatura();
        Torneio torneio = new Torneio(jogador);
        torneio.iniciaTorneio();
    }
}
