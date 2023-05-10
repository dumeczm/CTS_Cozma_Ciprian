package template.classes;

public class Masa extends iMasa{

    public Masa(int nr){
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa cu numarul " + super.getNr() + " a fost curatata");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa cu numarul " + super.getNr() + " are servetelele asezate");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa cu numarul " + super.getNr() + " are tacamurile asezate");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Persoanele au fost invitate la masa " + super.getNr());
    }

}
