package builder.classes;

public class ContBuilder implements iBuilder{
    ContBancar contBancar;

    public ContBuilder(){
        this.contBancar=new ContBancar(false,false,false,"");
    }
    @Override
    public ContBancar build() {
        return contBancar;
    }

    public ContBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;

    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;

    }

    public ContBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }
}
