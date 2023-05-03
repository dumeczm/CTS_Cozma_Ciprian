package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{

    String nume;
    int nrAngajati;
    List<UnitateBancara> lista;

    public Sucursala(String nume,int nrAngajati){
        this.nume=nume;
        this.nrAngajati=nrAngajati;
        lista=new ArrayList<>();
    }
    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println("Sucursala " + this.nume + " are " + this.nrAngajati + " angajati.");
        for (UnitateBancara unitateBancara : lista){
            unitateBancara.printDescriere(indentare+" ");
        }
    }
}
