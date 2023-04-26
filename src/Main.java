import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();

        Menu.Opcoes opcao = menu.showMenuPrincipal();

        if (opcao == Menu.Opcoes.NOVO_JOGO) {
            System.out.println("todo novo jogo");
        }
    }
}
