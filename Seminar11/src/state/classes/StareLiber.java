package state.classes;

public class StareLiber implements  iStare{

    @Override
    public void modificareStare(Masa masa) {
        if (masa.getStare() instanceof StareLiber){
            System.out.println("Masa este libera");
        }else{
            masa.setStare(this);
        }
    }
}
