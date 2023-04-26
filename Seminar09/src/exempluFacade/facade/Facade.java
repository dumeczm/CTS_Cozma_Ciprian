package exempluFacade.facade;

import exempluFacade.classes.Medic;
import exempluFacade.classes.Pacient;
import exempluFacade.classes.Salon;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient(10, "Radu Chivu"));
        medic.adaugaPacient(new Pacient(3, "Dany B"));
        medic.adaugaPacient(new Pacient(9, "John Becali"));
        this.salon = new Salon();
        salon.adaugarePatLiber(23);
        salon.adaugarePatLiber(15);
        salon.adaugarePatLiber(77);
    }

    public void interneazaPactient(String nume) {
        if (salon.verificarePaturiLibere()) {
            if (medic.verificaTrimitere(medic.getPacient(nume))) {
                if (medic.getPacient(nume).getGravitate() > 4) {
                    System.out.println("Pacientul " + nume + " este internat");
                    salon.ocupaPat();
                } else {
                    System.out.println("Iesi acas'");
                }
            }else{
                System.out.println("Nu exista trimitere");
            }
        }else{
            System.out.println("Nu avem paturi libere");
        }
    }


}
