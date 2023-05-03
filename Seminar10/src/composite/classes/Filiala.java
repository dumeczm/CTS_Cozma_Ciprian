package composite.classes;

import java.io.FileInputStream;

public class Filiala implements UnitateBancara{
    String nume;
    int nrAngajati;

    public Filiala(String nume, int nrAngajati){
        this.nume=nume;
        this.nrAngajati=nrAngajati;
    }
    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare + "Filiala " + this.nume + " are " + this.nrAngajati);
    }
}
