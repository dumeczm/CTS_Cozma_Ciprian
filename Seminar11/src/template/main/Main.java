package template.main;


import template.classes.Masa;
import template.classes.MasaRezervata;
import template.classes.iMasa;

public class Main {
    public static void main(String[] args){

        Masa masa = new Masa(3);
        masa.ocupaMasa();

        iMasa masaRezervata = new MasaRezervata(2,"14:30");

        masaRezervata.ocupaMasa();
    }
}
