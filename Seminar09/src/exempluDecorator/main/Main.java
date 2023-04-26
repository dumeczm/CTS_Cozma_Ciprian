package exempluDecorator.main;

import exempluDecorator.classes.DecoratorAbstract;
import exempluDecorator.classes.FurnizareRezultat;
import exempluDecorator.classes.RezultatFurnizatPeHartie;
import exempluDecorator.classes.RezultatOnline;

public class Main {
    public static void main(String[] args){
        FurnizareRezultat rezultatFurnizatPeHartie = new RezultatFurnizatPeHartie();
        rezultatFurnizatPeHartie.doSomething("Raceala");

        FurnizareRezultat rezultatOnline = new RezultatOnline(rezultatFurnizatPeHartie);
        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatFurnizatPeHartie);

        decoratorAbstract.doSomething("Raceala");
        decoratorAbstract.doSomethingExtra("Raceala");
    }
}
