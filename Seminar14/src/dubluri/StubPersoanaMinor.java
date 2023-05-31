package dubluri;

import model.IPersoana;

public class StubPersoanaMinor implements IPersoana {

    private String nume;
    public String CNP;

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 17;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
