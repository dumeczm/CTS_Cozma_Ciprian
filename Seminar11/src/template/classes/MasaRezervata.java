package template.classes;

public class MasaRezervata extends iMasa {
    private String oraRezervare;

    public MasaRezervata(int numar, String oraRezervare) {
        super(numar);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Am curatat masa cu numarul " + super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Am asezat servetele pentru masa cu numarul " + super.getNr() + " inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Am asezat tacamurile pentru masa cu numarul " + super.getNr() + " inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Am invitat persoanele pentru masa cu numarul " + super.getNr() + " inainte de ora " + this.oraRezervare);
    }
}
