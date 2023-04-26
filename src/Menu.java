import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public enum Opcoes {
        NOVO_JOGO
    }

    private void sair() {
        System.out.println("Tchau!");
        System.exit(0);
    }

    private int readIntegerLine() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(buffer.readLine());
    }

    public Opcoes showMenuPrincipal() throws IOException {
        System.out.println("Escolha uma opção: \n 0 - sair \n 1 - novo jogo");

        try {
            int i = this.readIntegerLine();

            if (i == 0) {
                this.sair();
            } else if (i == 1) {
                return Opcoes.NOVO_JOGO;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Opção inválida!\n");
            return this.showMenuPrincipal();
        }
        throw new Error("Ops, algo de errado não está certo");
    }
}
