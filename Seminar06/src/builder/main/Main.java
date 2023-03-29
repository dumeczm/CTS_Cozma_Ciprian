package builder.main;

import builder.classes.ContBancar;
import builder.classes.ContBuilder;
import builder.classes.ContBuilderv2;
import builder.classes.iBuilder;

public class Main {
    public static void main(String[] args) {
        iBuilder contBuilder = new ContBuilder();
        contBuilder.setCardAtasat(true);
        contBuilder.setNumeClient("Emiliano");
        contBuilder.setInternetBanking(true);
        ContBancar contBancar = contBuilder.build();
        ContBancar contBancar2= contBuilder.setNumeClient("Mary").setCardAtasat(false).build();

        System.out.println(contBancar);
        System.out.println(contBancar2);

        iBuilder contBancarBuilderv2= new ContBuilderv2();
        ContBancar contBancar3 = contBancarBuilderv2.setCardAtasat(true).setInternetBanking(true).setNumeClient("Ciupapi").build();
        ContBancar contBancar4 = contBancarBuilderv2.setPrimesteSalariu(true).setInternetBanking(true).setNumeClient("Cipapi2").build();
        System.out.println(contBancar3);
        System.out.println(contBancar4);

    }
}