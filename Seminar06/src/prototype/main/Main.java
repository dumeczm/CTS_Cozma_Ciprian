package prototype.main;

import prototype.classes.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     Map<String,Integer> documente = new HashMap<>();

     documente.put("CI",1);
     documente.put("Certigficat nastere",2);
     documente.put("Pasaport",3);

     ContBancar contBancar = new ContBancar("Ciprian",documente,6);
     ContBancar contBancarCopie = (ContBancar)  contBancar.cloneaza();


        System.out.println(contBancar);
        System.out.println(contBancarCopie);


    }
}