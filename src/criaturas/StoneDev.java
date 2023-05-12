package criaturas;

public class StoneDev extends Criatura {


    @Override
    public int getAtaqueElemetal(Criatura defensor) {
        int poderFisico = this.getAtaqueFisico(defensor);

        if (defensor instanceof StoneDev) {
            return (int) (poderFisico * 0.5);
        } else if (defensor instanceof WaveNerd) {
            return poderFisico * 2;
        } else {
            return poderFisico;
        }
    }

    @Override
    public String getEspecie() {
        return "StoneDev";
    }
}
