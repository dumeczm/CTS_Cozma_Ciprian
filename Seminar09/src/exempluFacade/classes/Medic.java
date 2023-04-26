package exempluFacade.classes;

import java.util.ArrayList;
import java.util.List;

public class Medic {

    private List<Pacient> listaPacienti;

    public Medic(){
        this.listaPacienti=new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient){
        this.listaPacienti.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient){
        return this.listaPacienti.contains(pacient);
    }

    public Pacient getPacient(String nume){
        for (Pacient pacient : listaPacienti){
            if(pacient.getNume().equals(nume)){
                return pacient;
            }
        }
        return null;
    }
}
