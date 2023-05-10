package criaturas;

public class WaveNerd extends Criatura {

    @Override
    public int getAtaqueElemetal(Criatura defensor) {
        int poderFisico = this.getAtaqueFisico(defensor);

        if (defensor instanceof WaveNerd) {
            return (int) (poderFisico * 0.5);
//        } else if (defensor instanceof BurnCoder) {
//            return poderFisico * 2;
        } else {
            return poderFisico;
        }
    }

    @Override
    public String getEspecie() {
        return "Wave Nerd";
    }
}
