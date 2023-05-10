package observer.classes;

public class Client implements iClient {
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + " ai primit urmatoarea notificare: " + mesaj);
    }
}
