package exempluDecorator.classes;

public class RezultatFurnizatPeHartie implements FurnizareRezultat{
    @Override
    public void doSomething(String diagnostic) {
        System.out.println("Am primntat pe hartie diagnosticul " + diagnostic);
    }
}
