package flyweight.main;

import flyweight.classes.Cont;
import flyweight.classes.FlyweightFactory;
import flyweight.classes.iClientBanca;

public class Main {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();
        Cont cont1=new Cont(2300f,1);
        Cont cont2=new Cont(2400f,2);
        Cont cont3=new Cont(2500f,3);

        iClientBanca detinator = factory.getDetinator("Ion","0444","Macedoniei");
        detinator.descriere(cont1);
        factory.getDetinator("Alin","31231","Timisoara").descriere(cont2);
        factory.getDetinator("Ion","0444","Macedoniei").descriere(cont3);
        factory.getDetinator("Alin","31231","Timisoara").descriere(cont1);
    }
}
