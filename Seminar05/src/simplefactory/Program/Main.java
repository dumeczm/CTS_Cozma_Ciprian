package simplefactory.Program;

import simplefactory.PersonalSpital;
import simplefactory.SimpleFactory;
import simplefactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory= new SimpleFactory();

        PersonalSpital medic = simpleFactory.createPersonal(TipPersonal.Medic,"Dr.Cirjau");
        PersonalSpital brancardier = simpleFactory.createPersonal(TipPersonal.Brancardier,"Daria");
        PersonalSpital asistent = simpleFactory.createPersonal(TipPersonal.Medic,"Liviu Iosim");
        PersonalSpital anestezist = simpleFactory.createPersonal(TipPersonal.Anestezist,"Ciprian",15);

    }
}