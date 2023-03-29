package simplefactory;

public class SimpleFactory {

    public PersonalSpital createPersonal(TipPersonal tipPersonal,String name) {
        switch (tipPersonal) {
            case Asistent -> {
                return new Asistent(name);
            }
            case Brancardier -> {
                return new Brancardier(name);
            }
            case Medic -> {
                return new Medic(name);
            }
            default ->{
                return null;
            }
        }
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal,String name, Integer numarAniVechime) {
            switch(tipPersonal){
                case Anestezist: return new Anestezist(name,numarAniVechime);
                default: return createPersonal(tipPersonal,name);
            }
    }
}
