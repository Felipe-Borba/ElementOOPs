import criaturas.Criatura;
import criaturas.StoneDev;
import criaturas.WaveNerd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void sair() {
        System.out.println("Tchau!");
        System.exit(0);
    }

    private static int readIntegerLine() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(buffer.readLine());
    }

    private static int readIntegerRange(int max) {
        try {
            int option = Menu.readIntegerLine();

            if (option <= max) {
                return option;
            } else {
                throw new NumberFormatException();
            }

        } catch (Exception nfe) {
            System.out.println("Opção inválida!\n");
            return Menu.readIntegerRange(max);
        }
    }

    public static void novoJogo() {
        System.out.print(
                "Escolha uma opção: \n"
                        + "0 - sair \n"
                        + "1 - novo jogo\n"
        );

        int option = Menu.readIntegerRange(1);

        if (option == 0) {
            Menu.sair();
        }
    }

    public static void iniciaTorneio() {
        System.out.print(
                "Escolha uma opção: \n"
                        + "0 - sair \n"
                        + "1 - inicia torneio\n"
        );

        int option = Menu.readIntegerRange(1);

        if (option == 0) {
            Menu.sair();
        }
    }

    public static Criatura selecionaCriatura() {
        System.out.print(
                "Escolha uma criatura: \n"
                        + "0 - sair\n"
                        + "1 - StoneDev (terra)\n"
                        + "2 - WaveNerd (água)\n"
                        + "3 - BurnCoder (fogo)\n"
                        + "4 - BreezeHacker (ar)\n"
        );

        // TODO: retornar instancia da criatura selecionada
        int selected = Menu.readIntegerRange(2);
        switch (selected) {
            case 0:
                Menu.sair();
            case 1:
                return new StoneDev();
            case 2:
                return new WaveNerd();
            default:
                throw new Error("Internal Error");
        }
    }

    enum TipoAtaque {
        FISICO, ELEMENTAL
    }
    public static TipoAtaque getTipoAtaque() {
        System.out.println(
                "Selecione um tipo de ataque:\n"
                + "0 - sair \n"
                + "1 - ataque fisico\n"
                + "2 - ataque alemental"
        );

        int selected = Menu.readIntegerRange(2);
        switch (selected) {
            case 0:
                Menu.sair();
            case 1:
                return TipoAtaque.FISICO;
            case 2:
                return TipoAtaque.ELEMENTAL;
        }

        throw new Error("opcao nao encontrada");
    }
}

/**
 * TODO nova ideia ter uma subclasse clamada opcao com dois atributos acao e descricao
 * ai toda vez que que tiver um menu de escolhas passa um ArrayList com as acoes e retorna apenas uma
 * para executar alguma acao
 */