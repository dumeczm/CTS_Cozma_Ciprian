package builder.classes;

public interface iBuilder{
    ContBancar build();

    iBuilder setCardAtasat(boolean card);
    iBuilder setPrimesteSalariu(boolean salariu);
    iBuilder setInternetBanking(boolean internet);
    iBuilder setNumeClient(String nume);


}
