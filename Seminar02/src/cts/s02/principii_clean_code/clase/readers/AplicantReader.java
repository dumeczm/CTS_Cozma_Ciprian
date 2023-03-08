package cts.s02.principii_clean_code.clase.readers;


import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    public abstract List<Aplicant>  readAplicanti(String fileName) throws FileNotFoundException;

    void readAplicant(Scanner scanner, Aplicant aplicant){

        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();

        aplicant.setNume(prenume);
        aplicant.setPrenume(nume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr,vect);

    }
}
