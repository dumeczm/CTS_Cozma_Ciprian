package observer.classes;

public interface iRestaurant {
    void abonareClient(iClient client);
    void dezabonareClient(iClient client);
    void notificareClienti(String mesaj);


}
