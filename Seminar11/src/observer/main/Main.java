package observer.main;

import observer.classes.Client;
import observer.classes.Restaurant;
import observer.classes.iClient;

public class Main {
        public static void main(String[] args) {
            iClient client1 = new Client("George");
            iClient client2 = new Client("Radu");
            iClient client3 = new Client("Alin");

            Restaurant restaurant = new Restaurant("Alpacino");

            restaurant.introduceOfertaNoua();

            restaurant.abonareClient(client1);

            restaurant.adaugaDiscount(25);

            restaurant.abonareClient(client2);
            restaurant.abonareClient(client3);
            restaurant.dezabonareClient(client1);

            restaurant.introduceOfertaNoua();
        }
}
