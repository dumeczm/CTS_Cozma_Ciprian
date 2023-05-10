package state.main;

import observer.classes.Client;
import observer.classes.Restaurant;
import observer.classes.iClient;
import state.classes.Masa;

public class Main {
        public static void main(String[] args) {
          Masa masa = new Masa(3);

          masa.ocupareMasa();
          masa.ocupareMasa();

          masa.rezervaMasa();

          masa.elibereazaMasa();

          masa.ocupareMasa();
        }
}
