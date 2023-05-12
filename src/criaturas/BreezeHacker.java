package criaturas;

public class BreezeHacker extends Criatura {


    @Override
    public int getAtaqueElemetal(Criatura defensor) {
        int poderFisico = this.getAtaqueFisico(defensor);

        if (defensor instanceof BreezeHacker) {
            return (int) (poderFisico * 0.5);
        } else if (defensor instanceof StoneDev) {
            return poderFisico * 2;
        } else {
            return poderFisico;
        }
    }

    @Override
    public String getEspecie() {
        return "BreezeHacker";
    }
}