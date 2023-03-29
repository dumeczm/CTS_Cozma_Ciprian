package builder.classes;

public class ContBuilderv2 implements iBuilder {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;


    public ContBuilderv2() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.internetBanking = false;
        this.numeClient = "mama";
    }

    public ContBuilderv2 setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBuilderv2 setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBuilderv2 setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBuilderv2 setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public ContBancar build(){
        ContBancar contBancar = new ContBancar(this.primesteSalariu,this.cardAtasat,this.internetBanking,this.numeClient);
        return contBancar;
    }
}
