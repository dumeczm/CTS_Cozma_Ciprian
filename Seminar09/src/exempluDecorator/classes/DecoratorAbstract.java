package exempluDecorator.classes;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat rezultatFurnizatPeHartie;
    @Override
    public void doSomething(String diagnostic){
        rezultatFurnizatPeHartie.doSomething(diagnostic);
    }

    public DecoratorAbstract(RezultatFurnizatPeHartie rezultatFurnizatPeHartie){
        this.rezultatFurnizatPeHartie=rezultatFurnizatPeHartie;
    }

    public abstract void doSomethingExtra(String diagnostic);
}
