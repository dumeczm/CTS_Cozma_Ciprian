package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements iRestaurant{

    String nume;

    List<iClient> listaClienti;

    public Restaurant(String nume){
        this.nume=nume;
        this.listaClienti=new ArrayList<>();
    }
    @Override
    public void abonareClient(iClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(iClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for (iClient clnt : listaClienti) {
            clnt.primesteNotificare(mesaj);
        }
    }
    public void introduceOfertaNoua(){
        String oferta = this.nume + "Oferta 1+1";
        notificareClienti(oferta);
    }

    public void adaugaDiscount(int discount){
        String mesaj = this.nume + "are discount-ul " + discount;
        notificareClienti(mesaj);
    }
}
