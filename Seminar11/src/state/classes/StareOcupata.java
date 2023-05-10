package state.classes;

public class StareOcupata implements iStare{
    @Override
    public void modificareStare(Masa masa) {
        if (masa.getStare() instanceof StareOcupata){
            System.out.println("Masa este ocupata");
        }else{
           masa.setStare(this);
        }
    }
}
