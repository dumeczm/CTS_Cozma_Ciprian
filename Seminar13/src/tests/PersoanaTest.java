package tests;

import model.ExceptieNenascut;
import model.IPersoana;
import model.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarsta() {
        IPersoana persoana = new Persoana("Andreo", "5020306047201");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaBoundaryNouNascut() {
        IPersoana persoana = new Persoana ("Andreo", "5230524123456");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaBoundaryLimitaInferioara() {
        IPersoana persoana = new Persoana ("Andreo", "5000101123456");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaBoundaryLimitaSuperioara() {
        IPersoana persoana = new Persoana ("Andreo", "2991231123456");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaErrorConditions() {
        IPersoana persoana = new Persoana ("Andreo", "6231231123456");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaPerformance() {
        IPersoana persoana = new Persoana ("Andreo", "5000101295444");
        assertTimeout(Duration.ofMillis(200), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void cnpCaractereCorect() {
        Persoana persoana = new Persoana ("Andreo", "6231231123456");
        assertEquals(13,persoana.CNP.length());

    }

    @org.junit.jupiter.api.Test
    void ordineVarstaPersoana() {
        Persoana persoana1 = new Persoana ("Andreo", "2991231295444");
        Persoana persoana2 = new Persoana ("Andreo", "5001231295444");
        assertTrue(persoana1.getVarsta()> persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void verificaConstructorCrossCheck() {
        Persoana persoana1 = new Persoana ("Andreo", "2991231295444");
        Persoana persoana2 = new Persoana ();
        persoana2.setNume("Andreo");
        persoana2.setCNP("2991231295444");
        assertEquals(persoana1.getCNP(),persoana2.getCNP());
        assertEquals(persoana1.getNume(),persoana2.getNume());
    }






}