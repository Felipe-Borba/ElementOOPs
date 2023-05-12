import criaturas.*;

import java.util.List;
import java.util.stream.Collectors;


public class Torneio {
    private final Criatura desafiante;
    private final List<Criatura> oponentes;

    public Torneio(Criatura desafiante) {
        this.desafiante = desafiante;

        // cria todos os tipos de criatura e depois remove a que for igual ao do desafiante
        // TODO add outros tipos de criatura
        List<Criatura> oponentes = List.of(new StoneDev(), new WaveNerd(), new BurnCoder(), new BreezeHacker());
        oponentes = oponentes.stream().filter(oponente -> oponente.getClass() != desafiante.getClass()).collect(Collectors.toList());

        this.oponentes = oponentes;
    }

    private int getTotalOponentes() {
        return this.oponentes.size();
    }


    public void iniciaTorneio() {
        while (this.getTotalOponentes() > 0) {
            Criatura oponente = this.oponentes.remove(0);

            Batalha batalha = new Batalha(this.desafiante, oponente);
            batalha.iniciaBatalha();

            // se chegou aqui venceu a batalha
        }
        // se chegou aqui venceu o torneio
        System.out.println("Parabens você venceu o torneio!");
    }
}
