package exempluFacade.classes;

public class Pacient {
    private int gravitate;
    private String nume;
    public Pacient (int gravitate,String nume){
        this.gravitate=gravitate;
        this.nume=nume;
    }

    public String getNume() {
        return this.nume;
    }

    public int getGravitate() {
        return this.gravitate;
    }
}
