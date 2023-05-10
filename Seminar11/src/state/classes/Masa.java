package state.classes;

public class Masa {
    int nrMasa;

    iStare stare;
    public Masa(int nr){
        this.nrMasa=nr;
        stare=new StareLiber();
    }

    protected void setStare(iStare stare){
        this.stare=stare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public iStare getStare() {
        return stare;
    }

    public void ocupareMasa(){
        iStare stare = new StareOcupata();
        stare.modificareStare(this);
    }

    public void rezervaMasa(){
        iStare stare = new StareRezervata();
        stare.modificareStare(this);
    }

    public void elibereazaMasa(){
        iStare stare = new StareLiber();
        stare.modificareStare(this);
    }

    public void anuleazaRezervare(){
        iStare stare = new StareLiber();
    }
}
