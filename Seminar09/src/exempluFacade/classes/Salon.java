package exempluFacade.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon(){
        this.coduriPaturiLibere= new ArrayList<>();
    }

    public void adaugarePatLiber(int codPat){
        this.coduriPaturiLibere.add(codPat);
    }
    public boolean verificarePaturiLibere(){
        return !this.coduriPaturiLibere.isEmpty();
    }

    public void ocupaPat(){
        coduriPaturiLibere.remove(0);
    }
}
