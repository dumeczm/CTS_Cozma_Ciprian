package dubluri;

import model.IPersoana;

public class StubPersoanaMajor implements IPersoana {

    private String nume;
    public String CNP;

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
