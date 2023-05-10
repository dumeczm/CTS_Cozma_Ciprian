package template.classes;

public abstract class iMasa {

    private int nr;

    public iMasa(int nr){
        this.nr=nr;
    }

    public int getNr() {
        return nr;
    }

    protected abstract void curataMasa();

    protected abstract void aseazaServetele();

    protected abstract void aseazaTacamuri();

    protected abstract void invitaPersoane();

    public final void ocupaMasa(){
        curataMasa();
        aseazaServetele();
        aseazaTacamuri();
        invitaPersoane();
    }
}
