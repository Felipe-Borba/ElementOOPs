package criaturas;

public class BurnCoder extends Criatura {


    @Override
    public int getAtaqueElemetal(Criatura defensor) {
        int poderFisico = this.getAtaqueFisico(defensor);

        if (defensor instanceof BurnCoder) {
            return (int) (poderFisico * 0.5);
        } else if (defensor instanceof BreezeHacker) {
            return poderFisico * 2;
        } else {
            return poderFisico;
        }
    }

    @Override
    public String getEspecie() {
        return "BurnCoder";
    }
}