package state.classes;

public class StareRezervata implements iStare{

    @Override
    public void modificareStare(Masa masa) {
        if (masa.getStare() instanceof StareRezervata || masa.getStare() instanceof StareOcupata){
            System.out.println("Masa este rezervata sau ocupata");
        }else{
            masa.setStare(this);
        }
    }
}
