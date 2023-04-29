import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private static void sair() {
        System.out.println("Tchau!");
        System.exit(0);
    }

    private static int readIntegerLine() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(buffer.readLine());
    }

    public static boolean novoJogo() throws IOException {
        System.out.println(
                "Escolha uma opção: \n"
                        + "0 - sair \n"
                        + "1 - novo jogo"
        );

        try {
            int i = Menu.readIntegerLine();

            if (i == 0) {
                Menu.sair();
            } else if (i == 1) {
                return true;
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Opção inválida!\n");
            return Menu.novoJogo();
        }
        return false;
    }

    public static Criatura selecionaCriatura() throws Exception {
        System.out.println(
                "Escolha uma criatura: \n"
                        + "0 - sair\n"
                        + "1 - StoneDev (terra)\n"//get from typeof
                        + "2 - WaveNerd (água)\n"//get from typeof
                        + "3 - BurnCoder (fogo)"//get from typeof
                        + "4 - BreezeHacker (ar)"//...
        );

        try {
            int options = Menu.readIntegerLine();

            // TODO: retornar instancia da criatura selecionada

        } catch (Exception e) {
            System.out.println("Opção inválida!\n");
            return selecionaCriatura();
        }
        throw new Error("Ops, Erro interno");
    }
}
