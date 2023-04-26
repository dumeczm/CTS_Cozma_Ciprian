package exempluDecorator.classes;

import java.sql.SQLOutput;

public class RezultatOnline extends DecoratorAbstract {
    public RezultatOnline(FurnizareRezultat rezultatFurnizatPeHartie) {
        super((RezultatFurnizatPeHartie) rezultatFurnizatPeHartie);
    }

    @Override
    public void doSomethingExtra(String diagnostic) {
        System.out.println("A fost afisat online " + diagnostic);
    }
}
