package dubluri;

import model.IPersoana;

public class FakePersoana implements IPersoana {
    private int getVarstaValue;
    private boolean getCheckCNPValue;
    public void setVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }
    public void setGetCheckCNPValue(boolean getCheckCNPValue) {
        this.getCheckCNPValue = getCheckCNPValue;
    }

    @Override
    public String getSex() {
        return "C";
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return getCheckCNPValue;
    }
}
