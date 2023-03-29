package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContCloneable {
    private String detinator;
    private Map<String, Integer> documente;

    private int numarFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documente, int numarFileDosar) {
        int sum = 0;
        for (Integer file : documente.values()) {
            sum += file;
        }
        if (sum == numarFileDosar) {
            this.detinator = detinator;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        } else {
            throw new IllegalArgumentException("Numar Incorect");
        }
    }

    private ContBancar() {

    }


    @Override
    public IContCloneable cloneaza() {
        ContBancar contCopie = new ContBancar();
        contCopie.detinator = detinator;
        contCopie.numarFileDosar = numarFileDosar;

        contCopie.documente = new HashMap<>();

        for (String key : this.documente.keySet()) {
            contCopie.documente.put(key, this.documente.get(key));
        }
    return contCopie;
    }
}
