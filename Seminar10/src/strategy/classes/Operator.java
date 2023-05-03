package strategy.classes;

public class Operator {
    private iModVerificare modVerificare;

    public Operator(){
        this.modVerificare= new VerificarePF();
    }
    public void setModVerificare(iModVerificare modVerificare){
        this.modVerificare=modVerificare;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }
}
