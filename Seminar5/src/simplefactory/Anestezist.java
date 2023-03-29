package simplefactory;

public class Anestezist extends PersonalSpital{

    private Integer numarAniVechime;
    public Anestezist(String name,Integer numarAniVechime){
        super(name);
        this.numarAniVechime=numarAniVechime;
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul" + super.getName() + " are " + this.numarAniVechime);
    }
}
