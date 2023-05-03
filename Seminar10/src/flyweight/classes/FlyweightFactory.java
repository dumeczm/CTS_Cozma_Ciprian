package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,iClientBanca> mapCont;

    public FlyweightFactory(){
        mapCont=new HashMap<>();
    }

    public iClientBanca getDetinator(String nume,String nrTelefon, String adresa){
        if(!mapCont.containsKey(nume)){
            iClientBanca client = new Detinator(nume,nrTelefon,adresa);
            mapCont.put(nume,client);
        }
        return mapCont.get(nume);
    }
}
