import criaturas.Criatura;

public class Batalha {
    private enum Turno {
        JOGADOR, OPONENTE
    }

    private final Criatura jogador;
    private final Criatura oponente;
    private Turno turno;

    public Batalha(Criatura jogador, Criatura oponente) {
        this.jogador = jogador;
        this.oponente = oponente;

        if (jogador.getVelocidade() > oponente.getVelocidade()) {
            this.turno = Turno.JOGADOR;
        } else {
            this.turno = Turno.OPONENTE;
        }
    }

    private boolean isDerrota() {
        return this.jogador.getPontosDeVida() < 1;
    }

    private boolean isVitoria() {
        return this.oponente.getPontosDeVida() < 1;
    }

    private void proximoTurno() {
        if (this.isTurnoJogador()) {
            this.turno = Turno.OPONENTE;
        } else {
            this.turno = Turno.JOGADOR;
        }
    }

    private boolean isTurnoJogador() {
        return this.turno == Turno.JOGADOR;
    }

    public void iniciaBatalha() {
        while (!this.isDerrota()) {
            //TODO move sout to menu
            System.out.println("\n-----");
            System.out.println("Status da batalha: ");
            System.out.println("jogador: " + jogador.getEspecie());
            System.out.println("vida: " + jogador.getPontosDeVida());
            System.out.println("oponente: " + oponente.getEspecie());
            System.out.println("vida: " + oponente.getPontosDeVida());
            System.out.println("-----");


            if (this.isTurnoJogador()) {
                System.out.println("Turno do jogador");
                Menu.TipoAtaque tipoAtaque = Menu.getTipoAtaque();

                int pontosAtaque = 0;
                if (tipoAtaque == Menu.TipoAtaque.FISICO) {
                    pontosAtaque = this.jogador.getAtaqueFisico(oponente);
                } else if (tipoAtaque == Menu.TipoAtaque.ELEMENTAL) {
                    pontosAtaque = this.jogador.getAtaqueElemetal(oponente);
                }

                System.out.println("oponente recebe " + pontosAtaque + " pontos dano");
                this.oponente.recebeDano(pontosAtaque);
            } else {
                System.out.println("Turno do oponente");

                int pontosAtaque = 0;
                if (Math.random() < 0.5) {
                    System.out.println("Oponente realiza um ataque fisico");
                    pontosAtaque = this.oponente.getAtaqueFisico(oponente);
                } else {
                    System.out.println("Oponente realiza um ataque elemental");
                    pontosAtaque = this.oponente.getAtaqueElemetal(oponente);
                }

                System.out.println("jogador recebe " + pontosAtaque + " pontos dano");
                jogador.recebeDano(pontosAtaque);
            }

            if (this.isVitoria()) {
                System.out.println("Parabens você venceu a batalha!");
                // TODO retornar aquele enum
                return;
            } else {
                this.proximoTurno();
            }

        }
        // TODO mover para a logica do torneio
        System.out.println("Voce foi derrotado!");
        Menu.sair();
    }
}
