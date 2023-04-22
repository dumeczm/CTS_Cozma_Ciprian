package simplefactory;

public abstract class PersonalSpital {
    private String name;

    public PersonalSpital(String name) {
        this.name=name;
    }

    public abstract void afiseazaDescriere();

    public String getName() {
        return name;
    }
}
